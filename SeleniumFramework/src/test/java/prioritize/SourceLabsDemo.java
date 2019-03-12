package prioritize;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SourceLabsDemo {

	public static final String USERNAME = "bosskaliya";
	public static final String ACCESS_KEY = "2cb511ed-90fe-40f5-9416-47b7da382802";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {


		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");


		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		//String projectLocation = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//div[3]/center/input")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());


		driver.quit();

		System.out.println("Test completed");
	}

}
