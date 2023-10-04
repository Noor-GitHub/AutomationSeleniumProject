package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import genericUtilities.BaseClass;


public class AmazonTest extends BaseClass {
	
	@Test
	public void amazon() {
		Reporter.log("Amazon" , true);
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon Login success by Noor" , true);
	}
	
	@Test
	public void Demo() {
		System.out.println("this is Demo");
	}
	
}
