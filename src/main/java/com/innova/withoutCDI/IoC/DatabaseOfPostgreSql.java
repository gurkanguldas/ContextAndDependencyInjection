package com.innova.withoutCDI.IoC;

public class DatabaseOfPostgreSql implements IDatabases{

	@Override
	public void connectionDatabase() 
	{
		System.out.println("Connected to PostgreSQL.");
	}
}
