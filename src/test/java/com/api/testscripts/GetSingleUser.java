package com.api.testscripts;

import org.testng.annotations.Test;

import com.api.base.Base;
import com.api.objectrespo.AppObjectRespo;
import com.aventstack.extentreports.Status;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetSingleUser extends Base {

	@Test
	public static void SingleUser() {
		
		test =extent.createTest("Get Single user");

		String response = given()
				.when().get("https://reqres.in/api/users?page=2")
				.then().statusCode(200).extract().body().asPrettyString();

		System.out.println(response);
		test.log(Status.INFO, response);
	}

}
