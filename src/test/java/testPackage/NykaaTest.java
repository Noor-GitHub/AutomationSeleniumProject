package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import genericUtilities.BaseClass;

public class NykaaTest extends BaseClass {
	
		@Test(retryAnalyzer = genericUtilities.RetryAnalyser.class)
		public void nykaa() throws InterruptedException {		
			Reporter.log("Nykaa" , true);
			driver.get("https://www.nykaa.com/");
			Thread.sleep(3000);
		}

}
