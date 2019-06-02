package CRUD;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class InstanceTest {

	@Test
	public void testThis() {
		given().
		when().
		get("http://localhost:8080/app/Instances");
	}
	
}
