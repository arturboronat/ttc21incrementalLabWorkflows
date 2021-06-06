/**
 */
package jobCollection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liquid Transfer Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobCollection.LiquidTransferJob#getTarget <em>Target</em>}</li>
 *   <li>{@link jobCollection.LiquidTransferJob#getTips <em>Tips</em>}</li>
 *   <li>{@link jobCollection.LiquidTransferJob#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see jobCollection.JobCollectionPackage#getLiquidTransferJob()
 * @model
 * @generated
 */
public interface LiquidTransferJob extends Job {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Labware)
	 * @see jobCollection.JobCollectionPackage#getLiquidTransferJob_Target()
	 * @model required="true"
	 * @generated
	 */
	Labware getTarget();

	/**
	 * Sets the value of the '{@link jobCollection.LiquidTransferJob#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Labware value);

	/**
	 * Returns the value of the '<em><b>Tips</b></em>' containment reference list.
	 * The list contents are of type {@link jobCollection.TipLiquidTransfer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tips</em>' containment reference list.
	 * @see jobCollection.JobCollectionPackage#getLiquidTransferJob_Tips()
	 * @model containment="true" required="true" upper="8"
	 * @generated
	 */
	EList<TipLiquidTransfer> getTips();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Labware)
	 * @see jobCollection.JobCollectionPackage#getLiquidTransferJob_Source()
	 * @model required="true"
	 * @generated
	 */
	Labware getSource();

	/**
	 * Sets the value of the '{@link jobCollection.LiquidTransferJob#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Labware value);

} // LiquidTransferJob
