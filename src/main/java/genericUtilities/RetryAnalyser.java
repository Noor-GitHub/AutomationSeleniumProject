package genericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{

	int count = 0;
	int retrylimit = 3;
	
	@Override
	public boolean retry(ITestResult result) {  // Failed
		
		if(count < retrylimit) {
			count++;
			return true;
		}
		
		return false;
	}

}
