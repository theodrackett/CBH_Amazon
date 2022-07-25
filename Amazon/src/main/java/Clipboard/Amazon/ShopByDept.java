package Clipboard.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopByDept {
	
	public WebDriver driver;
	
	By electronicsDept = By.linkText("TV, Appliances, Electronics");
	
	public ShopByDept(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement shopByDept() {
		
		return driver.findElement(electronicsDept);
	}

}
