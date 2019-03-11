package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {

	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent = null;
	String projectLocation = null;
	WebDriver driver = null;

	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent1.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


	}
	
	@BeforeTest
	public void setUpTest() {
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", projectLocation+"\\drivers\\IEdriver\\IEDriverServer.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test1() throws Exception {
		

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
		
		driver.get("https://google.com");
		test1.pass("Navigated to  google.com");

		//log(Status, details)
		test1.log(Status.INFO, "This step shows of log(status, details)");

		//info(details)
		test1.info("This step show ussage of infor(details)");

		//log with snapshot
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		//test with snapshot
		test1.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void test2() throws Exception {

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");

		//log(Status, details)
		test2.log(Status.INFO, "This step shows of log(status, details)");

		//info(details)
		test2.info("This step show ussage of infor(details)");

		//log with snapshot
		test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		//test with snapshot
		test2.addScreenCaptureFromPath("screenshot.png");

	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
	

	@AfterSuite
	public void tearDown() {

		// calling flush writes everything to the log file
		extent.flush();
	}
}
