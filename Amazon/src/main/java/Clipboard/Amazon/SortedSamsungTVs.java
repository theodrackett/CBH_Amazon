package Clipboard.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortedSamsungTVs {
	
	public WebDriver driver;
	
	By sortMenu = By.id("a-autoid-0-announce");
	By highLow = By.linkText("Price: High to Low");
	
	public SortedSamsungTVs(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement openSortMenu() {
		
		return driver.findElement(sortMenu);
	}
	
	public WebElement sortHighLow() {
		
		return driver.findElement(highLow);
	}

}
