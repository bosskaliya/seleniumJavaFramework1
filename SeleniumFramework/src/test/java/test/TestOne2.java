package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne2 {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", projectLocation+"\\drivers\\IEdriver\\IEDriverServer.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public static void googleSearch2() {
		
		
		/*
		 * Access Google.com
		 */
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]"));
		
	}
	
	@Test
	public static void googleSearch3() {
		
		
		/*
		 * Access Google.com
		 */
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Test with selenium");
		
		//driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]"));
		
	}


	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
	
}
