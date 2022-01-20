package com.innova.withoutCDI.IoC;

public class DatabaseManager {

	private IDatabases databases;

	public DatabaseManager(IDatabases databases) 
	{
		this.databases = databases;
	}
	
	public void newDatabase()
	{
		databases.connectionDatabase();
	}
	
}
