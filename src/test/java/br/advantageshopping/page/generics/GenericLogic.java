package br.advantageshopping.page.generics;


import static org.junit.Assert.assertTrue;

import br.advantageshopping.utils.Excel;
import br.advantageshopping.utils.Generic;

public class GenericLogic extends Generic {

	private GenericPage genericPage;
	private static Excel excel;

	public GenericLogic() {
		genericPage = new GenericPage();
		excel = new Excel();
	}
	
	public void toBrowse () {
		browseTheWeb("http://advantageonlineshopping.com/#/");
	}
	
	public void toClickUser () {
		waitElementIsClickable(genericPage.getBtnUser());
		click(genericPage.getBtnUser());
	}
	
	public void validateTest () throws Exception {
		excel.getExcelFile();
		waitElementIsClickable(genericPage.getTabletsTxt());
		wait(400);
		String user = driver.findElement(genericPage.getUserCreateTopIcon()).getText();
		boolean createdUserIsVisible;
		
		String spreadsheetUser = excel.getCellData("Usuario", 1);
		
		if (user.contains(spreadsheetUser)) {
			createdUserIsVisible = true;
		}
		else {
			createdUserIsVisible = false;
		}
		
		assertTrue(createdUserIsVisible);
	}
	
	public void validateTestLogout () throws Exception {
		boolean status = driver.findElement(genericPage.getBtnCart()).isDisplayed();
		if (status) {
			System.out.println("Cen�rio validado com sucesso!");
		}
		else {
			System.out.println("Cen�rio n�o validado!");
		}
	}
}
