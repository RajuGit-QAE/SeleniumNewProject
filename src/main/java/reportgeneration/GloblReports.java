package reportgeneration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GloblReports {
	
	
	public static ExtentReports generateReports()
	{
		String path = "C:\\Users\\DELL\\eclipse-workspace\\SeleniumRaja\\target\\Report";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);//generate the reports
		
		reporter.config().setDocumentTitle("NewReport");
		reporter.config().setReportName("ClientReport");
		
		
		ExtentReports extent = new ExtentReports();//it will show information
		extent.attachReporter(reporter);
		extent.setSystemInfo("TesterName", "Pranjali");
		
		return extent;
		
		
		
	}

}
