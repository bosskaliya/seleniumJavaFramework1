package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	    // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
        
        String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver", projectLocation+"\\drivers\\IEdriver\\IEDriverServer.exe");

		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.com");
		
		test1.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		test1.pass("Enter text into searchbox");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]"));
		
		test1.pass("Pressed Search button");
		
		driver.close();
		driver.quit();
		
		test1.pass("Clossed the browser");
		
		test1.info("Test Completed");
		
	    //////////////////////// second test with failure/////////
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two", "this is a test to validate google search functionality");
        
		System.out.println(projectLocation);
		
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver", projectLocation+"\\drivers\\IEdriver\\IEDriverServer.exe");

		
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.com");
		
		test2.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		test2.pass("Enter text into searchbox");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]"));
		
		test2.fail("Pressed Search button");
		
		driver.close();
		driver.quit();
		
		test1.pass("Clossed the browser");
		
		test2.info("Test Completed");
		
	    // calling flush writes everything to the log file
        extent.flush();
	}

}
