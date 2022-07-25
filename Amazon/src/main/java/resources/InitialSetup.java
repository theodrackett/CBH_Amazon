package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitialSetup {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver() throws IOException {
		
		// Determine which browser to use and configure driver accordingly
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/owner/git/repository/CBH_Amazon/Amazon/src/main/java/resources/data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/owner/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "/Users/owner/Downloads/geckodriver");
			driver = new FirefoxDriver();

		} else if (browserName.equals("ie")) {

			System.setProperty("webdriver.ie.driver", "/Users/owner/Downloads/iedriver");
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
	}

}
