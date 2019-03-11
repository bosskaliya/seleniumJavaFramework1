package test;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import config.PropertiesFile;
import demo.Log4jDemo;

public class TestOne {
	
	static WebDriver driver = null;
	public static String browserName = null;
	//private static Logger logger = LogManager.getLogger(Log4jDemo.class)
	
	@BeforeTest
	public void setUpTest() {
		String projectLocation = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
		
		System.out.println(projectLocation);
		
		//System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//System.setProperty("webdriver.ie.driver", projectLocation+"\\drivers\\IEdriver\\IEDriverServer.exe");
	}
	
	
	@Test
	public static void googleSearch() {
		
		
		/*
		 * Access Google.com
		 */
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]"));
		
	}

	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");
		PropertiesFile.setProperties();
		
	}
	
}
