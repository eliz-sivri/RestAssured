package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest1 {
	
	@Test
	
	public void Test1() {
		
		Response response = RestAssured.get("https://api.kommunity.com/api/v1/categories");
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getHeader(""));
		
		System.out.println(response.getBody().asString());
		System.out.println(response.jsonPath());
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}

}
