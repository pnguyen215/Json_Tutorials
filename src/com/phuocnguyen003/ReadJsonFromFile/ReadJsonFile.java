package com.phuocnguyen003.ReadJsonFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {

	public ReadJsonFile() {
	}

	public void readJsonFileLikeNormal(String stringPath) throws IOException {
		File file = new File(stringPath); /* initialization file */
		if (!file.exists()) { /* if file is not exist */
			file.createNewFile(); /* then create new file */

		} else {
			FileInputStream fileInputStream = new FileInputStream(file); /* thread read file */
			int words = fileInputStream.read();
			while (words != -1) { /* read all lines in file till the last line */
				System.out.print((char) words); /* convert word from integer to char : data type */
				words = fileInputStream.read(); /* read next line */
			}
			fileInputStream.close(); /* close connection */
		}
		System.out.println("");
		System.out.println("Finish!");
	}

	@SuppressWarnings({ "unchecked" })
	public void readJsonObject(String stringPath) {
		JSONParser jsonParser = new JSONParser(); /* decoding object JSON */
		File file = new File(stringPath);
		try {
			FileReader fileReader = new FileReader(file);
			Object object = jsonParser.parse(fileReader); /**/
			JSONObject jsonObject = (JSONObject) object; /* molding type from Object to JSONObject */
			System.out.println(jsonObject.toJSONString()); /* finish read file JSON */
			System.out.println("Get values from attributes: ");
			System.out.println((String) jsonObject.get("name")); /* get value of name attribute */
			System.out.println(jsonObject.get("id"));
			System.out.println(jsonObject.get("personal"));/* get value of personal attribute */
			System.out.println("");
			/*
			 * How to get all values of an attribute, which has many values like array
			 * include elements. In this example, we will get value of personal attribute.
			 * 
			 */
			JSONArray jsonArray = (JSONArray) jsonObject
					.get("personal"); /* convert all values in personal into JSONArray */
			Iterator<String> iterator = jsonArray.iterator(); /* Using Iterator to listed elements */
			while (iterator.hasNext()) {
				System.out.println(iterator.next()); /* print next element */
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
