package com.api.testscripts;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.api.base.Base;
import com.api.objectrespo.AppObjectRespo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserRegistration extends Base{
	
	
	
	@Test
	public static void userRegistration() {
		HashMap<String, String> testdata = new HashMap<String, String>();
		
		testdata.put("name", "prasad");
		testdata.put("job", "leader");
		
		String response = given().contentType("application/json").body(testdata)
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).extract().body().asPrettyString();
		
		System.out.println(response);
	}

}
