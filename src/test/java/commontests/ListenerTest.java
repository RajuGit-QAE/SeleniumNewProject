package commontests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reportgeneration.GloblReports;

public class ListenerTest implements ITestListener{
	ExtentTest test;
	ExtentReports extent = GloblReports.generateReports();
	
	public void onTestStart(ITestResult result) {
		extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Failed");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	

}
