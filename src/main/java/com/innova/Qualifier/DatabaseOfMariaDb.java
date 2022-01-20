package com.innova.Qualifier;

import javax.enterprise.inject.Default;

@Default
public class DatabaseOfMariaDb implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MariaDb.";
	}

}
