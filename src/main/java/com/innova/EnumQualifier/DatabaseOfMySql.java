package com.innova.EnumQualifier;

@EnumQualifier(EDatabases.MySQL)
public class DatabaseOfMySql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MySQL.";
	}
}
