package com.innova.Qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "QualifierDatabaseManager")
@ApplicationScoped
public class DatabaseManager implements Serializable{

	private static final long serialVersionUID = 1648478233333869916L;

	//Default Inject

	//@Inject
	//private IDatabases databases;

	//Qualifier Inject

	@Inject
	@QualifierMultipleSelection
	private IDatabases databases;

	public String newDatabase()
	{
		return databases.connectionDatabase();
	}

}
