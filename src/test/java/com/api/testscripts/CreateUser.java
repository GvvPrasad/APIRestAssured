package com.api.testscripts;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class CreateUser {
	
	@Test
	public void createsingleUser() {
		HashMap data = new HashMap();
		data.put("name", "Prasad");
		data.put("job", "leader");
		
		
		given().contentType("application/json").body(data)
		.when().post("https://reqres.in/api/users?page=2")
		.then().statusCode(201).log().all();
	}
}
