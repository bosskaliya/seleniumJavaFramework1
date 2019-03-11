package prioritize;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
	@Test(dependsOnGroups= {"sanity.*"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test(groups= {"sanity1"})
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test(groups= {"sanity2"})
	public void test3() {
		System.out.println("I am inside Test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
	}
}
