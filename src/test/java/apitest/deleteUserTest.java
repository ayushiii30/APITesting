package apitest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import base.BaseTest;
public class deleteUserTest extends BaseTest {
	
	@Test
	public void deleteUserDetails() {
		
		given()
		  .header("Content-Type" , "application/json")
		  .pathParams("id",1)
		.when()
		  .delete("/users/{id}")
		.then()
		  .statusCode(200)
		  .log().all();
		
	}

}
