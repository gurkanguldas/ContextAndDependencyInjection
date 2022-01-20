package com.innova.Interceptor;

import javax.enterprise.inject.Alternative;

@InterceptorDatabase
@Alternative
public class DatabaseOfMsSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MsSQL.";
	}
}
