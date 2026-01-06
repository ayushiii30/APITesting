package base;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;
public class BaseTest {
	
	@BeforeClass
	public void setup() {
		//RestAssured.baseURI = ConfigReader.get("baseUrl");
		RestAssured.baseURI = ConfigReader.get("BASE_URI");

	}
}
