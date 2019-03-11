package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("I am inside Test 2");
		
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver", projectLocation+"\\drivers\\IEdriver\\IEDriverServer.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bla bla");
		driver.findElement(By.xpath("//input[@name='abv']")).sendKeys("Bla bla");
		
		driver.close();
	}
	
	@Test
	public void test3() {
		
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}
	
	@Test
	public void test4() {
		
		System.out.println("I am inside Test 4");
	}
	
	@Test
	public void test5() {
		
		System.out.println("I am inside Test 5");
	}
	

}
