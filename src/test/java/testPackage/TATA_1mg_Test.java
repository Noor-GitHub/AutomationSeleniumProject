package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;


public class TATA_1mg_Test extends BaseClass {
	
	@Test
	public void myntra() {

		Reporter.log("TATA 1mg Open" , true);
		Reporter.log("TATA 1mg Page is Open" , true);
		driver.get("https://www.1mg.com/");
		System.out.println("TATA 1mg Application Opened");
		
	}
	
}
