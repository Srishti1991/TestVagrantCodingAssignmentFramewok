package com.testvagrant.utilities;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.testng.annotations.BeforeTest;

public class JsonDataReader {

	public String playername, role, country;
	public static int i;
	public static JSONArray PlayersArr;

	@BeforeTest
	public void beforeTest() throws IOException, ParseException {

		// parsing file "playersdetails.json"
		JSONParser jsonparser = new JSONParser();

		// json file path
		FileReader filereader = new FileReader(".\\jsonfiles\\playersdetails.json");
		Object obj = jsonparser.parse(filereader);

		// getting player from jsonarray object
		JSONObject playerobj = (JSONObject) obj;
		playerobj.get("name");
		PlayersArr = (JSONArray) playerobj.get("player");

	}
}
