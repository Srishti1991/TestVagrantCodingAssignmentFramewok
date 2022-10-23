package com.testvagrant.testobject;

import org.json.simple.JSONObject;

import com.testvagrant.utilities.JsonDataReader;

public class TestObject extends JsonDataReader {
	protected static String TotalIndianPlayer, TotalWicketkeeper, TotalForeignPlayer = null;
	protected static int count = 0;

	// @BeforeTest
	public static void getWicketKeepersInTeam() {
		count = 0;
		for (int i = 0; i < PlayersArr.size(); i++) {
			JSONObject jsn = ((JSONObject) PlayersArr.get(i));
			boolean keyVal1 = jsn.containsValue("Wicket-keeper");
			TotalWicketkeeper = String.valueOf(keyVal1);
			if (TotalWicketkeeper.contains("true")) {
				count++;
			}
			if (i == PlayersArr.size())
				break;
		}
		System.out.println();
		System.out.println("Total Number of WicketKeeper:: " + count);
		System.out.println();

	}

	// @BeforeTest
	public static void getForeignPlayer() {
		for (int i = 0; i < PlayersArr.size(); i++) {
			JSONObject jsn = ((JSONObject) PlayersArr.get(i));
			boolean keyVal = !jsn.containsValue("India");
			TotalForeignPlayer = String.valueOf(keyVal);
			if (TotalForeignPlayer.contains("true")) {
				count++;
			}
			if (i == PlayersArr.size())
				break;
		}
		System.out.println();
		System.out.println("Total Number of TotalForeignPlayer :: " + count);
		System.out.println();
	}
}