package com.innova.withoutCDI.withoutIoC;

public class MainTest {

	public static void main(String[] args) {

		DatabaseManager databaseManager = new DatabaseManager();
		databaseManager.newDatabase();

	}

}
