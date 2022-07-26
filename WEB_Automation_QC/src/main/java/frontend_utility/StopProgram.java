package frontend_utility;

public class StopProgram {

	BaseDriver driver;
	GenerateReport generateR = new GenerateReport();
	
	public void stopTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.getDriver().quit();
		generateR.setExtentReport().flush();
	}

	public StopProgram(BaseDriver driver, GenerateReport generateR) {
		this.driver = driver;
		this.generateR = generateR;
	}
}
