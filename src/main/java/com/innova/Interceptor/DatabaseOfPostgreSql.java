package com.innova.Interceptor;

import javax.enterprise.inject.Alternative;

@InterceptorDatabase
@Alternative
public class DatabaseOfPostgreSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to PostgreSQL.";
	}
}
