package ApiMethodTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetMethod {
	
	@BeforeClass
	public void setup() {
		Response url = RestAssured.get("https://reqres.in/api/users?page=2");
		
	}

	@Test
	public void get() {
		
		System.out.println("*******************************");
		System.out.println("url code - " + url.body().prettyPrint());
		int status = url.statusCode();
		System.out.println("Status is - " + status);
		long time = url.getTime();
		System.out.println("Time is - " + time + "/ms");
		Headers header = url.getHeaders();
		System.out.println("header is - "+header);
		
		System.out.println("cookies - "+url.getDetailedCookies());
		
		
		

	}

}
