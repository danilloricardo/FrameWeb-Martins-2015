/**
 */
package br.ufes.inf.nemo.frameweb.frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chaining Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency#getOutMethod <em>Out Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency#getInMethod <em>In Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency#getChainingDependendencyConstraint <em>Chaining Dependendency Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getChainingDependency()
 * @model annotation="Ecore constraints='ChainingDependencyConstraint'"
 *        annotation="Comments ChainingDependencyConstraint='A ChainingDependencyConstraint must have a FrontControllerClass as client and a FrontControllerClass as supplier and these client and supplier can not be the same.'"
 *        annotation="OCL ChainingDependencyConstraint='context ChainingDependency \r\n inv: \r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(FrontControllerClass)) and\r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(FrontControllerClass)) and \r\n  (self.oclAsType(Dependency).supplier <> self.oclAsType(Dependency).client) '"
 * @generated
 */
public interface ChainingDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Out Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Method</em>' reference.
	 * @see #setOutMethod(FrontControllerMethod)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getChainingDependency_OutMethod()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getOutMethod();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency#getOutMethod <em>Out Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Method</em>' reference.
	 * @see #getOutMethod()
	 * @generated
	 */
	void setOutMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>In Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Method</em>' reference.
	 * @see #setInMethod(FrontControllerMethod)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getChainingDependency_InMethod()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getInMethod();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency#getInMethod <em>In Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Method</em>' reference.
	 * @see #getInMethod()
	 * @generated
	 */
	void setInMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Chaining Dependendency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chaining Dependendency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chaining Dependendency Constraint</em>' containment reference.
	 * @see #setChainingDependendencyConstraint(ChainingConstraint)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getChainingDependency_ChainingDependendencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ChainingConstraint getChainingDependendencyConstraint();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency#getChainingDependendencyConstraint <em>Chaining Dependendency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chaining Dependendency Constraint</em>' containment reference.
	 * @see #getChainingDependendencyConstraint()
	 * @generated
	 */
	void setChainingDependendencyConstraint(ChainingConstraint value);

} // ChainingDependency