package prioritize;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	
	@Test
	public void one() {
		
		System.out.println("I am inside Test 1");
		
	}
	
	@Test(priority = 2)
	public void two() {
		
		System.out.println("I am inside Test 2");
		
	}
	
	@Test(priority = 1)
	public void test3() {
		
		System.out.println("I am inside Test 3");
		
	}

}
