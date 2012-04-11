package org.navee.osgi.samples.helloworld.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorldActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello AS7 World!!");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Bye AS7 World!!");
	}

}
