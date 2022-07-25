package Clipboard.Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHome extends InitialSetup {
	
	@Test
	public void startingPage() throws IOException {
		
		//Handles all operations on the Home Page
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/owner/git/repository/CBH_Amazon/Amazon/src/main/java/resources/data.properties");
		prop.load(fis);
		
		String amzUrl = prop.getProperty("amazon_url");
		driver = initDriver();
		driver.get(amzUrl);
		
		//Click on the hamburger menu
		LandingPage lp = new LandingPage(driver);
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
		Assert.assertEquals(ap.aboutText().getText(), "About this item");
	}

}
