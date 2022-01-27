package com.innova.Decorator;

import javax.decorator.Delegate;
import javax.inject.Inject;

@javax.decorator.Decorator
public abstract class DecoratorDatabase implements IDatabases {

	@Inject
	@Delegate
	private IDatabases decorator;

	@Override
	public String connectionDatabase() {

		System.out.println("Run Decorator.");

		return decorator.connectionDatabase() + "(Checked with Decorator)";
	}



}
