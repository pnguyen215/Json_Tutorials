package com.phuocnguyen001.Introduce;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DecodingJson {

	public DecodingJson() {
	}

	public void decodingJson() {
		JSONParser jsonParser = new JSONParser();
		String string = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		try {
			Object object = jsonParser.parse(string);
			System.out.println(object);
			JSONArray jsonArray = (JSONArray) object; /* molding type from Object to JSONArray */
			System.out.println("The 1st element of array: ");
			System.out.println(jsonArray.get(0));
			System.out.println("The 2nd element of array: ");
			System.out.println(jsonArray.get(1));

			System.out.println("Field \"1\" ");
			JSONObject jsonObject = (JSONObject) jsonArray.get(1);
			System.out.println(jsonObject.get("1"));

			System.out.println("Parser any json string");
			string = "{}";
			string = "[1,2]";
			object = jsonParser.parse(string);
			System.out.println(object);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

	}
}
