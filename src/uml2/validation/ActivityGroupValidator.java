/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Activity;
import uml2.ActivityEdge;
import uml2.ActivityGroup;
import uml2.ActivityNode;

/**
 * A sample validator interface for {@link uml2.ActivityGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityGroupValidator {
	boolean validate();

	boolean validateContainedNode(EList<ActivityNode> value);
	boolean validateInActivity(Activity value);
	boolean validateSubgroup(EList<ActivityGroup> value);
	boolean validateSuperGroup(ActivityGroup value);
	boolean validateContainedEdge(EList<ActivityEdge> value);
}