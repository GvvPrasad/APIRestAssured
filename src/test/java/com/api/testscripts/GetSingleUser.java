package com.api.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleUser {
	
	@Test
	void singleUser() {
		
		// Response, RestAssured - are classes from rest assured libries
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 201);
	}
}
