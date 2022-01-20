package com.innova.EnumQualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "EnumQualifierDatabaseManager")
@ApplicationScoped
public class DatabaseManager implements Serializable{

	private static final long serialVersionUID = 1648478233333869916L;

	//Default Inject

	//@Inject
	//private IDatabases databases;

	//Enum Qualifier Inject

	@Inject
	@EnumQualifier(EDatabases.MSSQL)
	private IDatabases databases;

	public String newDatabase()
	{
		return databases.connectionDatabase();
	}

}
