package br.advantageshopping.page.register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterStep {

	private RegisterLogic registerLogic;
	
	public RegisterStep () {
		registerLogic = new RegisterLogic();
	}
	
	@Given("^clico em criar nova conta$")
	public void clickCreateAccount() {
		registerLogic.toClickCreateAccount();
	}

	@Given("^digito username$")
	public void enterUserName() throws Exception {
		registerLogic.toEnterUserName();
	}

	@Given("^digito email valido \"([^\"]*)\"$")
	public void enterEmail(String email) {
		registerLogic.toEnterEmail(email);
	}

	@Given("^digito senha$")
	public void enterPassword() throws Exception {
		registerLogic.toEnterPassword();
	}

	@Given("^confirmo senha$")
	public void confirmPassword() throws Exception {
		registerLogic.toConfirmPassword();
	}

	@Given("^digito primeiro nome \"([^\"]*)\"$")
	public void enterFirstName(String firstName) {
		registerLogic.toEnterFirstName(firstName);
	}

	@Given("^digito ultimo nome \"([^\"]*)\"$")
	public void enterLastName(String lastName) {
		registerLogic.toEnterLastName(lastName);
	}

	@Given("^digito numero de telefone \"([^\"]*)\"$")
	public void enterTelephone(String telephone) {
		registerLogic.toEnterTelephone(telephone);
	}

	@Given("^seleciono pais \"([^\"]*)\"$")
	public void selectCountry(String country) {
		registerLogic.toSelectCountry(country);
	}

	@Given("^digito cidade \"([^\"]*)\"$")
	public void enterCity(String city) {
		registerLogic.toEnterCity(city);
	}

	@Given("^digito endereco \"([^\"]*)\"$")
	public void enterAdress(String adress) {
		registerLogic.toEnterAdress(adress);
	}

	@Given("^digito estado \"([^\"]*)\"$")
	public void enterState(String state) {
		registerLogic.toEnterState(state);
	}

	@Given("^digito codigo postal \"([^\"]*)\"$")
	public void enterPostalCode(String postalCode) {
		registerLogic.toEnterPostalCode(postalCode);
	}

	@Given("^seleciono aceitar condicoes$")
	public void selectAcceptConditions() {
		registerLogic.toSelectAcceptConditions();
	}

	@When("^clico em registrar$")
	public void clickRegister() {
		registerLogic.toClickRegister();
	}
}
