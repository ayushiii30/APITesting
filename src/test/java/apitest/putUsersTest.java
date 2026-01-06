package apitest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import POJO.UserRequest;
import base.BaseTest;


public class putUsersTest extends BaseTest{
	
	@Test
	public void updateUserDetails() {
		
	UserRequest user = new UserRequest();
	user.setName("Ayushi Goyal");
		
		given()
		  .pathParam("id", 1)
		  .header("Content-Type","application/json")
		  .body(user)
		.when()
		  .put("/users/{id}")
		.then()
		   .statusCode(200)
		   .log().all();
		  	
	}

}
