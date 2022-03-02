package br.advantageshopping.page.register;

import br.advantageshopping.utils.Excel;
import br.advantageshopping.utils.Generic;
import br.advantageshopping.utils.RandomString;

public class RegisterLogic extends Generic {
	
	private static Excel excel;
	private RegisterPage registerPage;
	private RandomString random;
	
	public RegisterLogic () {
		registerPage = new RegisterPage();
		random = new RandomString();
		excel =  new Excel();
	}
	
	public void toClickCreateAccount () {
		waitElementIsClickable(registerPage.getBtnCreateAccount());
		wait(500);
		click(registerPage.getBtnCreateAccount());
	}
	
	public void toEnterUserName () throws Exception {
		excel.getExcelFile();
		String randomUser = "teste" + random.createRandomString(6);
		clearAndInsertText(randomUser, registerPage.getCmpUserName());
		excel.setCellData(randomUser, 1, 0);
		wait(500);
	}
	
	public void toEnterEmail (String email) {
		waitElementIsClickable(registerPage.getCmpEmail());
		clearAndInsertText(email, registerPage.getCmpEmail());
	}
	
	public void toEnterPassword () throws Exception {
		waitElementIsClickable(registerPage.getCmpPassWord());
		wait(400);
		clearAndInsertText(excel.getCellData("Senha", 1), registerPage.getCmpPassWord());
	}
	
	public void toConfirmPassword () throws Exception {
		waitElementIsClickable(registerPage.getCmpConfirmPassWord());
		clearAndInsertText(excel.getCellData("Senha", 1), registerPage.getCmpConfirmPassWord());
	}
	
	public void toEnterFirstName (String firstName) {
		waitElementIsClickable(registerPage.getCmpFirstName());
		clearAndInsertText(firstName, registerPage.getCmpFirstName());
	}
	
	public void toEnterLastName (String lastName) {
		waitElementIsClickable(registerPage.getCmpLastName());
		clearAndInsertText(lastName, registerPage.getCmpLastName());
	}
	
	public void toEnterTelephone (String telephone) {
		waitElementIsClickable(registerPage.getCmpPhoneNumber());
		clearAndInsertText(telephone, registerPage.getCmpPhoneNumber());
	}
	
	public void toSelectCountry (String country) {
		waitElementIsClickable(registerPage.getCmpContry());
		selectComboByVisibleText(registerPage.getCmpContry(), country);
	}
	
	public void toEnterCity (String city) {
		waitElementIsClickable(registerPage.getCmpCity());
		clearAndInsertText(city, registerPage.getCmpCity());
	}
	
	public void toEnterAdress (String adress) {
		waitElementIsClickable(registerPage.getCmpAdress());
		clearAndInsertText(adress, registerPage.getCmpAdress());
	}
	
	public void toEnterState (String state) {
		waitElementIsClickable(registerPage.getCmpState());
		clearAndInsertText(state, registerPage.getCmpState());
	}
	
	public void toEnterPostalCode (String postalCode) {
		waitElementIsClickable(registerPage.getCmpPostalCode());
		clearAndInsertText(postalCode, registerPage.getCmpPostalCode());
	}
	
	public void toSelectAcceptConditions () {
		waitElementIsClickable(registerPage.getBxAgree());
		toClick(registerPage.getBxAgree());
	}
	
	public void toClickRegister () {
		waitElementIsClickable(registerPage.getBtnRegister());
		toClick(registerPage.getBtnRegister());
	}
}
