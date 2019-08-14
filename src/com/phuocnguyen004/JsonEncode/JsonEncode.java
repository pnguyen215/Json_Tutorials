package com.phuocnguyen004.JsonEncode;

import org.json.simple.JSONObject;

public class JsonEncode {

	public JsonEncode() {

	}

	@SuppressWarnings("unchecked")
	public void jsonObjectEncode() {
		JSONObject jsonObject = new JSONObject();
		/*
		 * add objects to JSON data
		 */
		jsonObject.put("name", "phuocnguyen");
		jsonObject.put("age", new Integer(23));
		jsonObject.put("major", "SE");

		System.out.print(jsonObject);
	}
}
