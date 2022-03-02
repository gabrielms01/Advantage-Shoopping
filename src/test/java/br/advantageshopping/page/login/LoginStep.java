package br.advantageshopping.page.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStep {

	private LoginLogic login;
	
	public LoginStep () {
		login = new LoginLogic();
	}
	
	@Given("^digito meu usuario$")
	public void enterMyUserName () throws Exception {
		login.fillUser();
	}
	
	@Given("^digito minha senha$")
	public void enterMyPassword () throws Exception {
		login.fillPassword();
	}
	
	@When("^clico em logar$")
	public void clickToLogin () {
		login.clickLogin();
	}
} 
