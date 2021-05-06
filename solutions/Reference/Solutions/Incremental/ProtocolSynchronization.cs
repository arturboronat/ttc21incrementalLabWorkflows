﻿using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Synchronizations;
using NMF.Transformations.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using TTC2021.LabWorkflows.JobCollection;
using TTC2021.LabWorkflows.LaboratoryAutomation;

namespace TTC2021.LabWorkflows.Solutions
{
    internal partial class ProtocolSynchronization : ReflectiveSynchronization
    {
        public void InitializeContext(IEnumerableExpression<ISample> samples, ISynchronizationContext context)
        {
            context.Data.Add( _platesKey, samples
                .ChunkIndexed( 8, ( samples, column ) => new ProcessColumn( column, samples.Select( tuple => new ProcessWell( tuple.Item2 % 96, tuple.Item1 ) ) ) )
                .Chunk( 12, ( columns, plateIndex ) => new ProcessPlate( $"Plate{plateIndex+1:00}", columns ) ) );

            context.Data.Add( _tubesKey, samples
                .ChunkIndexed( 16, ( samples, tubeIndex ) => new Tubes( $"Tube{tubeIndex+1:00}", samples.Select( tuple => new ProcessWell( tuple.Item2 % 16, tuple.Item1 ) ) ) ) );
        }

        private static readonly object _platesKey = new object();
        private static readonly object _tubesKey = new object();

        [LensPut(typeof(ProtocolSynchronization), nameof(SetSampleFailed))]
        public static bool IsSampleFailed(ISample sample)
        {
            return sample.State == SampleState.Error;
        }

        public static void SetSampleFailed(ISample sample, bool isFailed)
        {
            if (isFailed)
            {
                sample.State = SampleState.Error;
            }
        }

        [LensPut(typeof(ProtocolSynchronization), nameof(SetAllFailed))]
        public static bool AreAllFailed(IEnumerable<ISample> samples)
        {
            return samples.All( s => s.State == SampleState.Error );
        }

        public static void SetAllFailed(IEnumerable<ISample> samples, bool isFailed)
        {
            if (isFailed)
            {
                foreach(var sample in samples)
                {
                    SetSampleFailed( sample, true );
                }
            }
        }

        private static IEnumerableExpression<ProcessPlate> GetPlates( ITransformationContext context )
        {
            if (context.Data.TryGetValue(_platesKey, out var plates))
            {
                return plates as IEnumerableExpression<ProcessPlate>;
            }
            return null;
        }

        private static IEnumerableExpression<Tubes> GetTubes( ITransformationContext context)
        {
            if (context.Data.TryGetValue(_tubesKey, out var tubes))
            {
                return tubes as IEnumerableExpression<Tubes>;
            }
            return null;
        }

        internal static ICollectionExpression<ISample> GetAffectedSamples(ITransformationContext context, IJob job)
        {
            if (context.Data.TryGetValue(job, out var jobAffectedSamples) && jobAffectedSamples is ICollectionExpression<ISample> samples )
            {
                return samples;
            }
            samples = new ObservableSet<ISample>();
            context.Data.Add( job, samples );
            return samples;
        }

        public class JobRequestToJobCollection : SynchronizationRule<IJobRequest, IJobCollection>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly( SyncRule<ReagentToTrough>(),
                    request => request.Assay.Reagents, jobCollection => jobCollection.Labware.OfType<ILabware, Trough>() );
                SynchronizeManyLeftToRightOnly( SyncRule<ProcessPlateToMicroplate>(),
                    (request, context) => GetPlates(context), (jobCollection,_) => jobCollection.Labware.OfType<ILabware, Microplate>() );
                SynchronizeManyLeftToRightOnly( SyncRule<SamplesToTubeRunner>(), (request, context) => GetTubes(context), (jobCollection,_) => jobCollection.Labware.OfType<ILabware, TubeRunner>() );

                SynchronizeManyLeftToRightOnly( SyncRule<ProtocolStepToJobsRule>(),
                    (request, _) => request.Assay.Steps,
                    (jobCollection, context) => new CollectionOfJobCollections( jobCollection, context ) );
            }
        }

        public class ProcessPlateToMicroplate : SynchronizationRule<ProcessPlate, Microplate>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly( processPlate => processPlate.Name, plate => plate.Name );
            }
        }

        public class SamplesToTubeRunner : SynchronizationRule<Tubes, TubeRunner>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly( tubes => tubes.Name, tubes => tubes.Name );

                SynchronizeManyLeftToRightOnly( tubes => tubes.Samples.Select( s => s.Sample.SampleID ), tubes => tubes.Barcodes );
            }
        }

        public class ReagentToTrough : SynchronizationRule<IReagent, Trough>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly( reagent => reagent.Name, trough => trough.Name );
            }
        }

        public class ProtocolStepToJobsRule : SynchronizationRule<IProtocolStep, JobsOfProtocolStep>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly( step => step.Id, jobs => jobs.ProtocolStepName );

                SynchronizeLeftToRightOnly( this, step => step.Next, jobs => jobs.NextJobs );
            }
        }

        public abstract class ProtocolStepRule<T> : SynchronizationRule<T, JobsOfProtocolStep>
        {
            protected override JobsOfProtocolStep CreateRightOutput( T input, IEnumerable<JobsOfProtocolStep> candidates, ISynchronizationContext context, out bool existing )
            {
                existing = false;
                return new JobsOfProtocolStep( context );
            }
        }

    }
}
