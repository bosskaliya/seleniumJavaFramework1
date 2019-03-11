import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
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
		
		//List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		//int count = listOfInputElements.size();
		
		//System.out.println("Count of Input elements is: " + count);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bla bla");
		
		//WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		//textBox.sendKeys("Automation Step by Step");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.close();
	}

}
