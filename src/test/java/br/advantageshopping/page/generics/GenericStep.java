package br.advantageshopping.page.generics;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenericStep {

	private GenericLogic genericLogic;
	
	public GenericStep() {
		genericLogic = new GenericLogic();
	}
	
	@Given("^Navego para a pagina inical do site Advantage$")
	public void navigateWebSiteHomePage () {
		genericLogic.toBrowse();
	}
	
	@Given("^seleciono usuario$")
	public void selectUser () {
		genericLogic.toClickUser();
	}
	
	@Then("^valido mensagem final$")
	public void validateFinalMessage () throws Exception {
		genericLogic.validateTest();
	}
}
