package frontend_utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateReport {

	String pathOfReport = ".\\WEB_Automation_QC\\Reports\\";
	
	ExtentSparkReporter sparkReport;
	ExtentReports extentReport;
	ExtentTest extentTest;
	
	public void generateReport(String nameOfReport) {
		extentReport = new ExtentReports();
		sparkReport = new ExtentSparkReporter(pathOfReport + nameOfReport + ".html");
		extentReport.attachReporter(sparkReport);

		extentReport.setSystemInfo("Platform", "Windows");
		extentReport.setSystemInfo("Browser", "Chrome");
		extentReport.setSystemInfo("Java version", "JDK 17");
		extentReport.setSystemInfo("User", "Jordan");
	}
	
	public void createTest(String testName) {
		extentTest = extentReport.createTest(testName);
	}
	
	public ExtentReports setExtentReport() {
		return extentReport;
	}
}
