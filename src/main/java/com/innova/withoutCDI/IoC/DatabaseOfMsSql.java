package com.innova.withoutCDI.IoC;

public class DatabaseOfMsSql implements IDatabases{

	@Override
	public void connectionDatabase() 
	{
		System.out.println("Connected to MsSQL.");
	}
}
