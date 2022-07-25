package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopByDept {
	
	public WebDriver driver;
	
	By electronicsDept = By.linkText("TV, Appliances, Electronics");
	
	public ShopByDept(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement shopByDept() {
		JavascriptExecutor js = (JavascriptExecutor)driver; //Use JavascriptExecutor to scroll down the page
		js.executeScript("window.scrollBy(00,500)"); //Scroll down the page
		return driver.findElement(electronicsDept);
	}

}
