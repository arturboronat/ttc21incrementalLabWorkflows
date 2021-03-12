//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2021.LabWorkflows.LaboratoryAutomation
{
    
    
    /// <summary>
    /// The default implementation of the DistributeSample class
    /// </summary>
    [XmlNamespaceAttribute("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation")]
    [XmlNamespacePrefixAttribute("lab")]
    [ModelRepresentationClassAttribute("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation#//Distribute" +
        "Sample")]
    public partial class DistributeSample : ProtocolStep, IDistributeSample, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Volume property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private double _volume;
        
        private static Lazy<ITypedElement> _volumeAttribute = new Lazy<ITypedElement>(RetrieveVolumeAttribute);
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The volume property
        /// </summary>
        [DisplayNameAttribute("volume")]
        [CategoryAttribute("DistributeSample")]
        [XmlElementNameAttribute("volume")]
        [XmlAttributeAttribute(true)]
        public double Volume
        {
            get
            {
                return this._volume;
            }
            set
            {
                if ((this._volume != value))
                {
                    double old = this._volume;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnVolumeChanging(e);
                    this.OnPropertyChanging("Volume", e, _volumeAttribute);
                    this._volume = value;
                    this.OnVolumeChanged(e);
                    this.OnPropertyChanged("Volume", e, _volumeAttribute);
                }
            }
        }
        
        /// <summary>
        /// Gets the Class model for this type
        /// </summary>
        public new static IClass ClassInstance
        {
            get
            {
                if ((_classInstance == null))
                {
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation#//Distribute" +
                            "Sample")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the Volume property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> VolumeChanging;
        
        /// <summary>
        /// Gets fired when the Volume property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> VolumeChanged;
        
        private static ITypedElement RetrieveVolumeAttribute()
        {
            return ((ITypedElement)(((ModelElement)(TTC2021.LabWorkflows.LaboratoryAutomation.DistributeSample.ClassInstance)).Resolve("volume")));
        }
        
        /// <summary>
        /// Raises the VolumeChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnVolumeChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.VolumeChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the VolumeChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnVolumeChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.VolumeChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "VOLUME"))
            {
                return this.Volume;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "VOLUME"))
            {
                this.Volume = ((double)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "VOLUME"))
            {
                return Observable.Box(new VolumeProxy(this));
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation#//Distribute" +
                        "Sample")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the volume property
        /// </summary>
        private sealed class VolumeProxy : ModelPropertyChange<IDistributeSample, double>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public VolumeProxy(IDistributeSample modelElement) : 
                    base(modelElement, "volume")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override double Value
            {
                get
                {
                    return this.ModelElement.Volume;
                }
                set
                {
                    this.ModelElement.Volume = value;
                }
            }
        }
    }
}

