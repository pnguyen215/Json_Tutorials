package com.phuocnguyen001.Introduce;

import org.json.simple.JSONObject;

public class EncodingJson {

	public EncodingJson() {
	}

	@SuppressWarnings("unchecked")
	public void encodingUsingJsonObject() {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", new Integer(1));
		jsonObject.put("name", "DavidNguyen");
		jsonObject.put("tall", new Double(1.67));
		jsonObject.put("is_Student", new Boolean(true));

		// show JsonObjects
		System.out.println(jsonObject.toJSONString()); // or
		System.out.println(jsonObject.toString());
	}

}
