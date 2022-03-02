package br.advantageshopping.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.advantageshopping.core.Driver;

public class Generic extends Driver {
	
	public static WebElement findElement (By element) {
		return driver.findElement(element);
	}
	
	public static void toClick (By element) {
		findElement(element).click();
	}
	
	public void waitElementIsClickable (By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void wait (int timeInMillis) {
		try {
			Thread.sleep(timeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public Object executeJS (String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}
	
	public void click (By by) {
		WebElement element = findElement(by);
		executeJS("javascript:void(0)", element);
		element.click();
	}
	
	public static void clearAndInsertText (String text, By field) {
		if(findElement(field).isDisplayed()) {
			findElement(field).clear();
			wait(500);
			findElement(field).sendKeys(text);
		}
	}
	
	public static void selectComboByVisibleText (By by, String visibleText) {
		WebElement element = findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(visibleText);
	}
	
	public static boolean visibleElement (By element) {
		return driver.findElement(element).isDisplayed();
	}
	
	public void waitDesiredElement (By element) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
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
