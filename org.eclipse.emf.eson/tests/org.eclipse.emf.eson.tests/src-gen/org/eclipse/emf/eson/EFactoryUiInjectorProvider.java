/*
 * generated by Xtext
 */
package org.eclipse.emf.eson;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EFactoryUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.emf.eson.ui.internal.EFactoryActivator.getInstance().getInjector("org.eclipse.emf.eson.EFactory");
	}
	
}