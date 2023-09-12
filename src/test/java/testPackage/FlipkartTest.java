package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class FlipkartTest extends BaseClass {

	@Test(retryAnalyzer = genericUtilities.RetryAnalyser.class)
	public void flipkart() throws InterruptedException {		
		Reporter.log("flipkart" , true);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	}
	
}
