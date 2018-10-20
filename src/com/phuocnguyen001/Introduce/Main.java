package com.phuocnguyen001.Introduce;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		EncodingJson encodingJson = new EncodingJson();
		encodingJson.encodingUsingJsonObject();
		DecodingJson decodingJson = new DecodingJson();
		decodingJson.decodingJson();
	}

}
