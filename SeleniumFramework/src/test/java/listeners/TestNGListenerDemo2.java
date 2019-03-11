package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo2 {
	
	@Test
	public void test6() {
		
		System.out.println("I am inside Test 6");
	}
	
	@Test
	public void test7() {
		
		System.out.println("I am inside Test 7");
	}
	
	@Test
	public void test8() {
		
		System.out.println("I am inside Test 8");
		throw new SkipException("This test is skipped");
	}
	
	@Test
	public void test9() {
		
		System.out.println("I am inside Test 9");
	}
	
	@Test
	public void test10() {
		
		System.out.println("I am inside Test 10");
	}
	

}
