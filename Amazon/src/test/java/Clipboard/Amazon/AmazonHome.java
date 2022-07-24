package Clipboard.Amazon;

import java.io.IOException;

import org.testng.annotations.Test;

public class AmazonHome extends InitialSetup {
	
	@Test
	public void startingPage() throws IOException {
		
		driver = initDriver();
		driver.get("https://www.amazon.in/");
		
	}

}
