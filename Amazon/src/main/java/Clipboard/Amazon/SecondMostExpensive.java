package Clipboard.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondMostExpensive {
	
	public WebDriver driver;
	
	By secondMostExp = By.xpath("//div[@id='search']/div/div/div[1]/span[3]/div[2]/div[2]");
	
	public SecondMostExpensive(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement secondMostExpTV() {
		
		return driver.findElement(secondMostExp);
	}
	

}
