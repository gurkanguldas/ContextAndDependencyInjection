package com.innova.withoutCDI.withoutIoC;

public class DatabaseManager {

	public void newDatabase()
	{
		Databases databases = new Databases();
		databases.connectionDatabase(1);
	}
}
