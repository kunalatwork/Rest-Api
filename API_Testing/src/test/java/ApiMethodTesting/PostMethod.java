package ApiMethodTesting;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	@Test
	public void Post() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject objct = new JSONObject();
		objct.put("name", "kunal");
		objct.put("job", "testing");
		objct.put("id", "123");
		request.body(objct.toString());
		Response req = request.post("https://reqres.in/api/users");
		System.out.println("Code - "+req.getStatusCode());
		System.out.println("time - "+req.getTime());
	}

}
