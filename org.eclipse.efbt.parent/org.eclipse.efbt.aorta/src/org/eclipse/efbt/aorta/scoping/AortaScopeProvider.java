/*
 * generated by Xtext 2.21.0
 */
package org.eclipse.efbt.aorta.scoping;

import org.eclipse.efbt.testing.common.model.test_definition.Clause;
import org.eclipse.efbt.testing.common.model.test_definition.Given;
import org.eclipse.efbt.testing.common.model.test_definition.Param;
import org.eclipse.efbt.testing.common.model.test_definition.TestContraints;
import org.eclipse.efbt.testing.common.model.test_definition.TestDefinition;
import org.eclipse.efbt.testing.common.model.test_definition.TestTemplate;
import org.eclipse.efbt.testing.common.model.test_definition.Then;
import org.eclipse.efbt.testing.common.model.test_definition.When;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.EcoreUtil2;

import org.eclipse.xtext.scoping.Scopes;

import java.util.List;

import org.apache.log4j.LogManager;



/**
 * This class contains custom scoping description.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 * @author Neil Mackenzie
 */
public class AortaScopeProvider extends AbstractAortaScopeProvider {

	/**
	 * We hae specialized the getScope method so that it gives special scoping rules
	 * for how we may choose the parameters for Given, When and Then clauses.
	 * 
	 * The parameters must be of the correct type defined by the test definition
	 * and must exist under the root defined in the test template.
	 * 
	 * 
	 * @param context
	 * @param reference
	 * @return
	 */
	public IScope getScope(EObject context, EReference reference) {
		
		
		Object LOGGER = LogManager.getLogger(AortaScopeProvider.class);

		if ((context.eContainer()) instanceof Clause) {
			if (context instanceof Param) {
				Clause bddclauseElement = (Clause) (context.eContainer());
				TestDefinition bddElement = (TestDefinition) (bddclauseElement.eContainer());
				TestContraints coverageTestSet = bddElement.getTestContraints();
				TestTemplate coverageTestType = coverageTestSet.getTemplate();

				// find out index of containing bddclauseElement
				int index = bddclauseElement.getParams().indexOf(context);

				if (bddclauseElement instanceof Given) {

					int size = coverageTestSet.getGivenParams().size();
					if (index < size) {
						EObject templateObject = coverageTestSet.getGivenParams().get(index).getParam();
						EObject templateType = coverageTestType.getGivenParams().get(index).getParam();

						List<? extends EObject> candidates = EcoreUtil2.getAllContentsOfType(templateObject,
								templateType.getClass());

						return Scopes.scopeFor(candidates);
					}

				}

				if (bddclauseElement instanceof When) {

					int size = coverageTestSet.getWhenParams().size();
					if (index < size) {
						EObject templateObject = coverageTestSet.getWhenParams().get(index).getParam();
						EObject templateType = coverageTestType.getWhenParams().get(index).getParam();

						List<? extends EObject> candidates = EcoreUtil2.getAllContentsOfType(templateObject,
								templateType.getClass());

						return Scopes.scopeFor(candidates);
					}

				}

				if (bddclauseElement instanceof Then) {

					int size = coverageTestSet.getThenParams().size();
					if (index < size) {

						EObject templateObject = coverageTestSet.getThenParams().get(index).getParam();
						EObject templateType = coverageTestType.getThenParams().get(index).getParam();

						List<? extends EObject> candidates = EcoreUtil2.getAllContentsOfType(templateObject,
								templateType.getClass());

						return Scopes.scopeFor(candidates);

					}
				}

			}

		}
		return super.getScope(context, reference);
	}
}
