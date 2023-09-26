package testPackage;

import org.testng.Reporter;
import genericUtilities.BaseClass;

public class TATAMotors extends BaseClass{

	public static void main(String[] args) {
		Reporter.log("TATA Motors" , true);
		driver.get("https://www.tatamotors.com/");
	}
}
