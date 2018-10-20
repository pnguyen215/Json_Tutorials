package com.phuocnguyen003.ReadJsonFromFile;

import java.io.IOException;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		ReadJsonFile readJsonFile = new ReadJsonFile();
		try {
			readJsonFile.readJsonFileLikeNormal("jsonSchema.json");
			System.out.println("");
			readJsonFile.readJsonObject("jsonSchema.json");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
