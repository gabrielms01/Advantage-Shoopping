package br.advantageshopping.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.advantageshopping.core.Driver;

public class Generic extends Driver {
	
	public static WebElement findElement (By element) {
		return driver.findElement(element);
	}
	
	public static void click (By element) {
		findElement(element).click();
	}
	
	public void waitElementIsClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void wait (int timeInMillis) {
		try {
			Thread.sleep(timeInMillis);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void clearAndInsertText (String text, By field) {
		if(findElement(field).isDisplayed()) {
			findElement(field).clear();
			wait(400);
			findElement(field).sendKeys(text);
		}
	}
	
	public void screenShot (String status, String testName) {
		try {
			TakesScreenshot source = (TakesScreenshot) Driver.openChrome();
			File src = source.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("Evidences" + File.separator + status + File.separator + testName + ".jpg"));
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}
}
