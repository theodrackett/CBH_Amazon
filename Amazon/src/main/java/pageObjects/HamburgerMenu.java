package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HamburgerMenu {
	
	public WebDriver driver;
	
	By hamburgerMenu = By.id("nav-hamburger-menu");
	
	public HamburgerMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement burgerMenu() {
		
		return driver.findElement(hamburgerMenu);
	}

}
