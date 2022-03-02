package br.advantageshopping.page.login;

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
}
