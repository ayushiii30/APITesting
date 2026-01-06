package apitest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import POJO.UserRequest;
import base.BaseTest;
public class postUserTest extends BaseTest {
   @Test
   public void createUserDetails() {
	   UserRequest user = new UserRequest();
	   user.setName("Ayushi");
	   user.setUserName("ayushi01");
	   user.setEmail("ayushi01@gmail.com");
	   
	   given()
	    .header("Content-Type","application/json")
	    .body(user)
	    
	.when()
	    .post("/users")
	.then()
	    .statusCode(201)
	    .body("name", equalTo("Ayushi"))
	    .log().all();


   }
}
