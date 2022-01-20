package com.innova.EnumQualifier;

@EnumQualifier(EDatabases.MSSQL)
public class DatabaseOfMsSql implements IDatabases{

	@Override
	public String connectionDatabase()
	{
		return "Connected to MsSQL.";
	}
}
