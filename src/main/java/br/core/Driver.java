package br.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public static WebDriver openChrome() {
		if (driver == null) {
			String pathDriverChrome = System.getProperty("user.dir")
					+ "//src/main/java/br/core/chromedriver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", pathDriverChrome);
			driver = new ChromeDriver();
			wait = new WebDriverWait(Driver.openChrome(), 30);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void browseTheWeb(String url) {
		Driver.openChrome().get(url);
	}
	
	public static void closeChrome() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
