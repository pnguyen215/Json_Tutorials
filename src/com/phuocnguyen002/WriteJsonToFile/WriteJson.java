package com.phuocnguyen002.WriteJsonToFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

	public WriteJson() {
	}

	@SuppressWarnings({ "unchecked" })
	public void writeJsonToFile() {
		Scanner scanner = new Scanner(System.in); /* allow user enter value external by using keyboard */
		File file = new File("jsonSchema.json"); /* create file name jsonSchema.json */
		FileOutputStream fileOutputStream = null; /* create thread-connect to write file */
		String stringAnswer = null;
		JSONObject jsonObject = new JSONObject(); /* initialization JSONObject to add attributes on JSON file */
		jsonObject.put("id", new Integer(1)); /* the 1st attribute */
		jsonObject.put("name", "DavidNguyen");/* the 2nd attribute */
		JSONArray jsonListArray = new JSONArray(); /* initialization array to add values for attribute */
		jsonListArray.add("gender"); /* values of 3rd attribute */
		jsonListArray.add("locate");/* values of 3rd attribute */
		jsonListArray.add("from");/* values of 3rd attribute */
		jsonObject.put("personal", jsonListArray); /* the 3rd attribute */

		try {
			if (!file.exists()) { /* If file not exist */
				file.createNewFile();
				fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(jsonObject.toJSONString().getBytes()); /* write contents to file */
				fileOutputStream.close();
				System.out.println("Finish!");
			} else {

				System.out.println("You want to override contents on file?");
				stringAnswer = scanner.nextLine();
				switch (stringAnswer.toLowerCase()) {
				case "yes": {
					FileOutputStream fileOutputStream2nd = new FileOutputStream(file,
							true); /* allow to override contents on file */
					fileOutputStream2nd.write(jsonObject.toJSONString().getBytes());
					fileOutputStream2nd.close();
					System.out.println("Yes - Finish!");
					break;
				}
				case "no": {
					System.out.println("No - Finish!");
					break;
				}
				default: {
					System.out.println("Wrong!");
					break;
				}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
