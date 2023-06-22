package Naukri.com.Naukri.com;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG
{
	public static ExtentReports getReportObject3()
	{
		String path =System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Naukri Resume Upload");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Raju Suryawanshi");
		extent.setSystemInfo("Windows", "10");
		extent.setSystemInfo("Machine", "Acer");
		
		return extent;
		
		
		
	}

	
}
