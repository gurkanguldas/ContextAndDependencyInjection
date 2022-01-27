package com.innova.Decorator;

import javax.enterprise.inject.Alternative;

@Alternative
public class DatabaseOfPostgreSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to PostgreSQL.";
	}
}
