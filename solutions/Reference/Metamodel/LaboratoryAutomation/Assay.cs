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
    /// The default implementation of the Assay class
    /// </summary>
    [XmlIdentifierAttribute("name")]
    [XmlNamespaceAttribute("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation")]
    [XmlNamespacePrefixAttribute("lab")]
    [ModelRepresentationClassAttribute("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation#//Assay")]
    [DebuggerDisplayAttribute("Assay {Name}")]
    public partial class Assay : ModelElement, IAssay, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Name property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private string _name;
        
        private static Lazy<ITypedElement> _nameAttribute = new Lazy<ITypedElement>(RetrieveNameAttribute);
        
        private static Lazy<ITypedElement> _stepsReference = new Lazy<ITypedElement>(RetrieveStepsReference);
        
        /// <summary>
        /// The backing field for the Steps property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private ObservableCompositionOrderedSet<IProtocolStep> _steps;
        
        private static Lazy<ITypedElement> _reagentsReference = new Lazy<ITypedElement>(RetrieveReagentsReference);
        
        /// <summary>
        /// The backing field for the Reagents property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private ObservableCompositionOrderedSet<IReagent> _reagents;
        
        private static IClass _classInstance;
        
        public Assay()
        {
            this._steps = new ObservableCompositionOrderedSet<IProtocolStep>(this);
            this._steps.CollectionChanging += this.StepsCollectionChanging;
            this._steps.CollectionChanged += this.StepsCollectionChanged;
            this._reagents = new ObservableCompositionOrderedSet<IReagent>(this);
            this._reagents.CollectionChanging += this.ReagentsCollectionChanging;
            this._reagents.CollectionChanged += this.ReagentsCollectionChanged;
        }
        
        /// <summary>
        /// The name property
        /// </summary>
        [DisplayNameAttribute("name")]
        [CategoryAttribute("Assay")]
        [XmlElementNameAttribute("name")]
        [IdAttribute()]
        [XmlAttributeAttribute(true)]
        public string Name
        {
            get
            {
                return this._name;
            }
            set
            {
                if ((this._name != value))
                {
                    string old = this._name;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnNameChanging(e);
                    this.OnPropertyChanging("Name", e, _nameAttribute);
                    this._name = value;
                    this.OnNameChanged(e);
                    this.OnPropertyChanged("Name", e, _nameAttribute);
                }
            }
        }
        
        /// <summary>
        /// The steps property
        /// </summary>
        [LowerBoundAttribute(1)]
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("steps")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        [ConstantAttribute()]
        public IOrderedSetExpression<IProtocolStep> Steps
        {
            get
            {
                return this._steps;
            }
        }
        
        /// <summary>
        /// The reagents property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("reagents")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        [ConstantAttribute()]
        public IOrderedSetExpression<IReagent> Reagents
        {
            get
            {
                return this._reagents;
            }
        }
        
        /// <summary>
        /// Gets the child model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> Children
        {
            get
            {
                return base.Children.Concat(new AssayChildrenCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new AssayReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation#//Assay")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets a value indicating whether the current model element can be identified by an attribute value
        /// </summary>
        public override bool IsIdentified
        {
            get
            {
                return true;
            }
        }
        
        /// <summary>
        /// Gets fired before the Name property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanging;
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanged;
        
        private static ITypedElement RetrieveNameAttribute()
        {
            return ((ITypedElement)(((ModelElement)(TTC2021.LabWorkflows.LaboratoryAutomation.Assay.ClassInstance)).Resolve("name")));
        }
        
        /// <summary>
        /// Raises the NameChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the NameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveStepsReference()
        {
            return ((ITypedElement)(((ModelElement)(TTC2021.LabWorkflows.LaboratoryAutomation.Assay.ClassInstance)).Resolve("steps")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Steps property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void StepsCollectionChanging(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanging("Steps", e, _stepsReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Steps property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void StepsCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Steps", e, _stepsReference);
        }
        
        private static ITypedElement RetrieveReagentsReference()
        {
            return ((ITypedElement)(((ModelElement)(TTC2021.LabWorkflows.LaboratoryAutomation.Assay.ClassInstance)).Resolve("reagents")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Reagents property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ReagentsCollectionChanging(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanging("Reagents", e, _reagentsReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Reagents property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ReagentsCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Reagents", e, _reagentsReference);
        }
        
        /// <summary>
        /// Gets the relative URI fragment for the given child model element
        /// </summary>
        /// <returns>A fragment of the relative URI</returns>
        /// <param name="element">The element that should be looked for</param>
        protected override string GetRelativePathForNonIdentifiedChild(IModelElement element)
        {
            int stepsIndex = ModelHelper.IndexOfReference(this.Steps, element);
            if ((stepsIndex != -1))
            {
                return ModelHelper.CreatePath("steps", stepsIndex);
            }
            int reagentsIndex = ModelHelper.IndexOfReference(this.Reagents, element);
            if ((reagentsIndex != -1))
            {
                return ModelHelper.CreatePath("reagents", reagentsIndex);
            }
            return base.GetRelativePathForNonIdentifiedChild(element);
        }
        
        /// <summary>
        /// Resolves the given URI to a child model element
        /// </summary>
        /// <returns>The model element or null if it could not be found</returns>
        /// <param name="reference">The requested reference name</param>
        /// <param name="index">The index of this reference</param>
        protected override IModelElement GetModelElementForReference(string reference, int index)
        {
            if ((reference == "STEPS"))
            {
                if ((index < this.Steps.Count))
                {
                    return this.Steps[index];
                }
                else
                {
                    return null;
                }
            }
            if ((reference == "REAGENTS"))
            {
                if ((index < this.Reagents.Count))
                {
                    return this.Reagents[index];
                }
                else
                {
                    return null;
                }
            }
            return base.GetModelElementForReference(reference, index);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "NAME"))
            {
                return this.Name;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Gets the Model element collection for the given feature
        /// </summary>
        /// <returns>A non-generic list of elements</returns>
        /// <param name="feature">The requested feature</param>
        protected override System.Collections.IList GetCollectionForFeature(string feature)
        {
            if ((feature == "STEPS"))
            {
                return this._steps;
            }
            if ((feature == "REAGENTS"))
            {
                return this._reagents;
            }
            return base.GetCollectionForFeature(feature);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "NAME"))
            {
                this.Name = ((string)(value));
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
            if ((attribute == "NAME"))
            {
                return new NameProxy(this);
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the property name for the given container
        /// </summary>
        /// <returns>The name of the respective container reference</returns>
        /// <param name="container">The container object</param>
        protected override string GetCompositionName(object container)
        {
            if ((container == this._steps))
            {
                return "steps";
            }
            if ((container == this._reagents))
            {
                return "reagents";
            }
            return base.GetCompositionName(container);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation#//Assay")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// Gets the identifier string for this model element
        /// </summary>
        /// <returns>The identifier string</returns>
        public override string ToIdentifierString()
        {
            if ((this.Name == null))
            {
                return null;
            }
            return this.Name.ToString();
        }
        
        /// <summary>
        /// The collection class to to represent the children of the Assay class
        /// </summary>
        public class AssayChildrenCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private Assay _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public AssayChildrenCollection(Assay parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    count = (count + this._parent.Steps.Count);
                    count = (count + this._parent.Reagents.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.Steps.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.Reagents.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.Steps.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.Reagents.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IProtocolStep stepsCasted = item.As<IProtocolStep>();
                if ((stepsCasted != null))
                {
                    this._parent.Steps.Add(stepsCasted);
                }
                IReagent reagentsCasted = item.As<IReagent>();
                if ((reagentsCasted != null))
                {
                    this._parent.Reagents.Add(reagentsCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Steps.Clear();
                this._parent.Reagents.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.Steps.Contains(item))
                {
                    return true;
                }
                if (this._parent.Reagents.Contains(item))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                IEnumerator<IModelElement> stepsEnumerator = this._parent.Steps.GetEnumerator();
                try
                {
                    for (
                    ; stepsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = stepsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    stepsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> reagentsEnumerator = this._parent.Reagents.GetEnumerator();
                try
                {
                    for (
                    ; reagentsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = reagentsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    reagentsEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                IProtocolStep protocolStepItem = item.As<IProtocolStep>();
                if (((protocolStepItem != null) 
                            && this._parent.Steps.Remove(protocolStepItem)))
                {
                    return true;
                }
                IReagent reagentItem = item.As<IReagent>();
                if (((reagentItem != null) 
                            && this._parent.Reagents.Remove(reagentItem)))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Steps).Concat(this._parent.Reagents).GetEnumerator();
            }
        }
        
        /// <summary>
        /// The collection class to to represent the children of the Assay class
        /// </summary>
        public class AssayReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private Assay _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public AssayReferencedElementsCollection(Assay parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    count = (count + this._parent.Steps.Count);
                    count = (count + this._parent.Reagents.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.Steps.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.Reagents.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.Steps.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.Reagents.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IProtocolStep stepsCasted = item.As<IProtocolStep>();
                if ((stepsCasted != null))
                {
                    this._parent.Steps.Add(stepsCasted);
                }
                IReagent reagentsCasted = item.As<IReagent>();
                if ((reagentsCasted != null))
                {
                    this._parent.Reagents.Add(reagentsCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Steps.Clear();
                this._parent.Reagents.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.Steps.Contains(item))
                {
                    return true;
                }
                if (this._parent.Reagents.Contains(item))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                IEnumerator<IModelElement> stepsEnumerator = this._parent.Steps.GetEnumerator();
                try
                {
                    for (
                    ; stepsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = stepsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    stepsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> reagentsEnumerator = this._parent.Reagents.GetEnumerator();
                try
                {
                    for (
                    ; reagentsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = reagentsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    reagentsEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                IProtocolStep protocolStepItem = item.As<IProtocolStep>();
                if (((protocolStepItem != null) 
                            && this._parent.Steps.Remove(protocolStepItem)))
                {
                    return true;
                }
                IReagent reagentItem = item.As<IReagent>();
                if (((reagentItem != null) 
                            && this._parent.Reagents.Remove(reagentItem)))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Steps).Concat(this._parent.Reagents).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the name property
        /// </summary>
        private sealed class NameProxy : ModelPropertyChange<IAssay, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public NameProxy(IAssay modelElement) : 
                    base(modelElement, "name")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Name;
                }
                set
                {
                    this.ModelElement.Name = value;
                }
            }
        }
    }
}

