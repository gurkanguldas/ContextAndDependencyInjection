package com.innova.withoutCDI.IoC;

public class DatabaseOfMariaDb implements IDatabases{

	@Override
	public void connectionDatabase() 
	{
		System.out.println("Connected to MariaDb.");
	}

}
