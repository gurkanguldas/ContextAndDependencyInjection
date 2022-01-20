package com.innova.EnumQualifier;

@EnumQualifier(EDatabases.MariaDB)
public class DatabaseOfMariaDb implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MariaDb.";
	}

}
