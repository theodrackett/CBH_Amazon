package Clipboard.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {
	
	public WebDriver driver;
	
	By about = By.xpath("//div[@id='feature-bullets']/h1");
	
	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement aboutText() {
		
		return driver.findElement(about);
	}
	

}
