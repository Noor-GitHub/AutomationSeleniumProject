package testPackage;

import org.testng.Reporter;
import genericUtilities.BaseClass;

public class AliBaba extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reporter.log("alibaba" , true);
		driver.get("https://www.alibaba.com/");
	}

}
