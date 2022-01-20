package com.innova.CDI;

import javax.enterprise.inject.Alternative;

@Alternative
public class DatabaseOfMsSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MsSQL.";
	}
}
