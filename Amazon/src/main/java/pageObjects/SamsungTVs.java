package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungTVs {
	
	public WebDriver driver;
	
	By samsungs = By.linkText("Samsung");
	
	public SamsungTVs(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement samsungtvs() {
		JavascriptExecutor js = (JavascriptExecutor)driver; //Use JavascriptExecutor to scroll down the page
		js.executeScript("window.scrollBy(00,500)"); //Scroll down the page
		return driver.findElement(samsungs);
	}

}
