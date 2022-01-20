package com.innova.Qualifier;

public class DatabaseOfPostgreSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to PostgreSQL.";
	}
}
