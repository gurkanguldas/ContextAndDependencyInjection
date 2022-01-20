package com.innova.Qualifier;

public class DatabaseOfMySql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MySQL.";
	}
}
