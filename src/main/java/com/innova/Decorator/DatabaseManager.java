package com.innova.Decorator;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "DecoratorDatabaseManager")
@ApplicationScoped
public class DatabaseManager implements Serializable{

	private static final long serialVersionUID = 1648478233333869916L;

	@Inject
	private IDatabases databases;

	public String newDatabase()
	{
		return databases.connectionDatabase();
	}
}
