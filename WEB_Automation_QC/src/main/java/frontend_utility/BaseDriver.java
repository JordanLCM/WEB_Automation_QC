package frontend_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

	String chromeDriver = "webdriver.chrome.driver";
	String chromeDriverPath = ".\\src\\main\\resources\\chromedriver.exe";
	
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriverProperty() {
		System.setProperty(chromeDriver, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
