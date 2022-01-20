package com.innova.Stereotype;

import java.io.Serializable;

import javax.inject.Inject;

@StereotypeDatabase
public class DatabaseManager implements Serializable{

	private static final long serialVersionUID = 1648478233333869916L;

	@Inject
	private IDatabases databases;

	public String newDatabase()
	{
		return databases.connectionDatabase();
	}

}
