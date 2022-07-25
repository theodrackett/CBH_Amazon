package Clipboard.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungTVs {
	
	public WebDriver driver;
	
	By samsungs = By.linkText("Samsung");
	
	public SamsungTVs(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement samsungtvs() {
		
		return driver.findElement(samsungs);
	}

}
