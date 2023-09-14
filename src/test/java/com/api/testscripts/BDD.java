package com.api.testscripts;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BDD {
	
	// baseuri -  is from rest assured library
	// static imports are must when using given, when, then 
	// given - headers, payload
	// when - get, post, delete, url
	// teh validations
	
//	@Test
	void user() {

		baseURI = "https://reqres.in/api/";
		when()
		.get("users/2")
		.then().statusCode(200).body("data.id", equalTo(2));
	}
	
	@Test
	void newPost() {
		
		JSONObject payload = new JSONObject();
		payload.put("name", "prasad");
		payload.put("job", "QA");
		
		
		baseURI = "https://reqres.in/api/";
		given().contentType(ContentType.JSON).body(payload)
		.when().post("users")
		.then().statusCode(201).log().body();
		
	}
	

}
