package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;


public class TATA_BigBasket_Test extends BaseClass {
	
	@Test
	public void myntra() {
		Reporter.log("TATA Bigbasket" , true);
		driver.get("https://www.bigbasket.com/");
	}
	
}
