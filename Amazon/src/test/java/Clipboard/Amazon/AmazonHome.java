package Clipboard.Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class AmazonHome extends InitialSetup {
	
	@Test
	public void startingPage() throws IOException {
		
		//Handles all operations on the Home Page
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/owner/git/repository/CBH_Amazon/Amazon/src/main/java/resources/data.properties");
		prop.load(fis);
		
		String amzUrl = prop.getProperty("amazon_url");
		System.out.println(amzUrl);
		driver = initDriver();
		driver.get(amzUrl);
		
		//Click on the hamburger menu
		LandingPage lp = new LandingPage(driver);
		lp.burgerMenu().click();
		
		
		
	}

}
