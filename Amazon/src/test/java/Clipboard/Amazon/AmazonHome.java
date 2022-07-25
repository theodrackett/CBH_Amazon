package Clipboard.Amazon;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import pageObjects.HamburgerMenu;
import pageObjects.SamsungTVs;
import pageObjects.SecondMostExpensive;
import pageObjects.ShopByDept;
import pageObjects.SortedSamsungTVs;
import pageObjects.TVPage;
import resources.InitialSetup;

public class AmazonHome extends InitialSetup {
	
	@BeforeTest
	public void startup() throws IOException {

		//Initialize driver object and get url
		driver = initDriver();
		driver.get(prop.getProperty("amazon_url"));
		
	}
	
	@Test
	public void startingPage() {
				
		//Click on the hamburger menu
		HamburgerMenu lp = new HamburgerMenu(driver);
		lp.burgerMenu().click();
		
		//Go to electronics department
		ShopByDept sbd = new ShopByDept(driver);
		sbd.shopByDept().click();
		
		//Go to the television section
		TVPage tv = new TVPage(driver);
		tv.tvPage().click();
		
		//Filter down to just Samsung TVs
		SamsungTVs samsungs = new SamsungTVs(driver);
		samsungs.samsungtvs().click();
		
		//Open the sort menu
		SortedSamsungTVs sstvs = new SortedSamsungTVs(driver);
		sstvs.openSortMenu().click();
		
		//Sort TVs High to Low
		sstvs.sortHighLow().click();
		
		//Get current window handle
		String currentWindow = driver.getWindowHandle();
		
		//Grab second most expensive TV
		SecondMostExpensive sme = new SecondMostExpensive(driver);
		sme.secondMostExpTV().click();
		
		//Switch to new window
		for(String newWindowHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(newWindowHandle);
		}
		
		//Assertion for 'About this item'
		AboutPage ap = new AboutPage(driver);
		ap.aboutText().getText();
		AssertJUnit.assertEquals(ap.aboutText().getText(), "About this item");
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
