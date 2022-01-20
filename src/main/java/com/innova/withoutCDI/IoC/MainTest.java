package com.innova.withoutCDI.IoC;

public class MainTest 
{
	public static void main(String[] args) {
		DatabaseManager databaseManager = new DatabaseManager(new DatabaseOfMsSql());
		databaseManager.newDatabase();
	}
}
