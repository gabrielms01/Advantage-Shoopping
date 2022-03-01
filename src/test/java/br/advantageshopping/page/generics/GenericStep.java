package br.advantageshopping.page.generics;

import cucumber.api.java.en.Given;

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
	
	/*public void validateFinalMessage () throws Exception {
		genericLogic.validateTest();
	}*/
}
