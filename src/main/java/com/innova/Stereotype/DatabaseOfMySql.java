package com.innova.Stereotype;

import javax.enterprise.inject.Alternative;

@Alternative
public class DatabaseOfMySql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MySQL.";
	}
}
