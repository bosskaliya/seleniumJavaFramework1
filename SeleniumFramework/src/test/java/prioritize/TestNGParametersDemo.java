package prioritize;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	
	@Test
	@Parameters("Milan")
	public void test(@Optional("Yovchev") String name) {
		
		System.out.println("Name is: " +name);
	}

}
