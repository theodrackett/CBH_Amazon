package Clipboard.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By hamburgerMenu = By.id("nav-hamburger-menu");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement burgerMenu() {
		
		return driver.findElement(hamburgerMenu);
	}

}
