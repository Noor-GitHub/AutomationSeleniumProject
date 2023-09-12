package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;


public class MyntraTest extends BaseClass {
	
	@Test
	public void myntra() {
		Reporter.log("Myntra" , true);
		driver.get("https://www.myntra.com/");
	}
	
}
