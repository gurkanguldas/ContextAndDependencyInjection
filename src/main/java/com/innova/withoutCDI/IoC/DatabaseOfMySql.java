package com.innova.withoutCDI.IoC;

public class DatabaseOfMySql implements IDatabases{

	@Override
	public void connectionDatabase() 
	{
		System.out.println("Connected to MySQL.");
	}
}
