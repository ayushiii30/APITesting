package apitest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import base.BaseTest;
public class getUserTests extends BaseTest {
     @Test
     public void getUserDetails() {
    	given()
    	  .pathParams("id",2)
    	  .header("Content-Type","application/json")
    	.when()
    	  .get("/users/{id}")

    	.then()
    	    .statusCode(200)
    	    .body("id", equalTo(2))
    	    .log().all();
    	      	
     }   
}
  







