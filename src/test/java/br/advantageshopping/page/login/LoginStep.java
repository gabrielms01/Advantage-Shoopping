package br.advantageshopping.page.login;

import cucumber.api.java.en.And;
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
	
	@And("^clico em logar$")
	public void clickToLogin () {
		login.clickLogin();
	}
	
	@And("^seleciono a categoria tablets$")
	public void selectTabletsCategory () {
		login.selectTablets();
	}
	
	@And("^seleciono o primeiro tablet$")
	public void selectFirstTablet () {
		login.selectTabletHP();
	}
	
	@And("^adiciono tablet ao carrinho$")
	public void addTabletToCart () {
		login.addProductToCart();
	}
	
	@And("^seleciono o usuario atual$")
	public void selectUserToLogout () {
		login.selectAtualUser();
	}
	
	@When("^realizo logout$")
	public void logoutThePage () {
		login.logout();
	}
} 
