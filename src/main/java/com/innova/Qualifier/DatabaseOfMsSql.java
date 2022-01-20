package com.innova.Qualifier;


@QualifierMultipleSelection
public class DatabaseOfMsSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MsSQL.";
	}
}
