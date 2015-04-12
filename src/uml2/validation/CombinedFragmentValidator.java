/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Gate;
import uml2.InteractionOperand;
import uml2.InteractionOperatorKind;

/**
 * A sample validator interface for {@link uml2.CombinedFragment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CombinedFragmentValidator {
	boolean validate();

	boolean validateCfragmentGate(EList<Gate> value);
	boolean validateInteractionOperator(InteractionOperatorKind value);
	boolean validateOperand(EList<InteractionOperand> value);
}