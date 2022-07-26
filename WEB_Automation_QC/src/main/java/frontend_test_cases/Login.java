package frontend_test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import frontend_utility.BaseDriver;
import frontend_utility.GenerateReport;
import frontend_utility.StopProgram;

public class Login {

	BaseDriver driver = new BaseDriver();
	StopProgram stopPro = new StopProgram(driver, generateR);
	GenerateReport generateR = new GenerateReport();
	
	String url = "https://wl003.the777888.com/";
	
	@BeforeClass
	public void startSystem() {
		generateR.generateReport("LOGIN feature test report");
		driver.setDriverProperty();
	}
	
	@Test
	public void openBrowser() {
		generateR.createTest("openBrowser");
		driver.getDriver().get(url);
	}
	
	@AfterClass
	public void stopSystem() throws InterruptedException {
		stopPro.stopTest();
	}
}