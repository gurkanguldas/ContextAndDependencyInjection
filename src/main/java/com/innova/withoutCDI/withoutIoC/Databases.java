package com.innova.withoutCDI.withoutIoC;

public class Databases {

	public void connectionDatabase(int db)
	{
		if(db == 0)
		{
			System.out.println("Connected to MySQL.");
		}
		else if(db == 1)
		{
			System.out.println("Connected to MariaDb.");
		}
		else if(db == 2)
		{
			System.out.println("Connected to MsSQL.");
		}
		else if(db == 3)
		{
			System.out.println("Connected to PostgreSQL.");
		}
		else
		{
			System.out.println("You have selected a different database.");
		}
	}
}
