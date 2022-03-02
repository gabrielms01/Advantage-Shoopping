package br.advantageshopping.page.login;

import org.openqa.selenium.By;

public class LoginPage {

	private By cmpUserName = By.xpath("//input[@name='username']");
	private By cmpSenha = By.xpath("//input[@name='password']");
	private By btnLogar = By.xpath("(//*[contains(text(),'SIGN IN')])[2]");

	public By getCmpUserName() {
		return cmpUserName;
	}

	public By getCmpSenha() {
		return cmpSenha;
	}

	public By getBtnLogar() {
		return btnLogar;
	}
}
