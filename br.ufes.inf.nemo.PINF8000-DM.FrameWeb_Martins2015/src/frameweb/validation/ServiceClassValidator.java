/**
 *
 * $Id$
 */
package frameweb.validation;

import frameweb.ServiceAttribute;
import frameweb.ServiceOperation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link frameweb.ServiceClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServiceClassValidator {
	boolean validate();

	boolean validateServiceClassAttribute(ServiceAttribute value);
	boolean validateServiceClassOperation(EList<ServiceOperation> value);
}