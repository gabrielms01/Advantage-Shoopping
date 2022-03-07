package br.advantageshopping.page.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import br.advantageshopping.utils.Excel;
import br.advantageshopping.utils.Generic;

public class LoginLogic extends Generic {
	
	private LoginPage login;
	private static Excel excel;
	
	public LoginLogic () {
		login = new LoginPage();
		excel = new Excel();
	}
	
	public void fillUser () throws Exception {
		excel.getExcelFile();
		waitDesiredElement(login.getCmpUserName());
		wait(5000);
		clearAndInsertText(excel.getCellData("Usuario", 1), login.getCmpUserName());
	}
	
	public void fillPassword () throws Exception {
		waitDesiredElement(login.getCmpSenha());
		clearAndInsertText(excel.getCellData("Senha", 1), login.getCmpSenha());
	}
	
	public void clickLogin () {
		waitElementIsClickable(login.getBtnLogar());
		toClick(login.getBtnLogar());
	}
	
	public void selectTablets () {
		waitElementIsClickable(login.getPrdTablets());
		wait(500);
		toClick(login.getPrdTablets());
	}
	
	public void selectTabletHP () {
		waitElementIsClickable(login.getPrdTabletHP());
		wait(500);
		toClick(login.getPrdTabletHP());
	}
	
	public void addProductToCart () {
		waitElementIsClickable(login.getAddToCart());
		wait(500);
		toClick(login.getAddToCart());
	}
	
	public void selectAtualUser () {
		waitElementIsClickable(login.getSelectUser());
		wait(500);
		toClick(login.getSelectUser());
	}
	
	public void logout () {
		WebElement element = driver.findElement(login.getSignOut());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element);
	}
}
