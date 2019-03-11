package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {		
		driver.findElement(button_search);
		
	}

}
