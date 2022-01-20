package com.innova.EnumQualifier;

import javax.enterprise.inject.Default;

@Default
public class DatabaseOfPostgreSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to PostgreSQL.";
	}
}
