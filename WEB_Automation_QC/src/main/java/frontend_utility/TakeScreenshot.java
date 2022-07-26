package frontend_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {

	String screenShotPath = ".\\WEB_Automation_QC\\Screenshots\\";

	BaseDriver driver;

	public TakeScreenshot(BaseDriver driver) {
		this.driver = driver;
	}
	
	public void takeScreenShot(String fileName) {
		File screenShot = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File(screenShotPath + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}