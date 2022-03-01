package br.advantageshopping.page.generics;


//import br.advantageshopping.utils.Excel;
import br.advantageshopping.utils.Generic;

public class GenericLogic extends Generic {

	private GenericPage genericPage;
	//private static Excel excel;

	public GenericLogic() {
		genericPage = new GenericPage();
		//excel = new Excel();
	}
	
	public void toBrowse () {
		browseTheWeb("http://advantageonlineshopping.com/#/");
	}
	
	public void toClickUser () {
		waitElementIsClickable(genericPage.getBtnUser());
		click(genericPage.getBtnUser());
	}
	
	/*public void validateTest () throws Exception {
		excel.getExcelFile();
		waitElementIsClickable(genericPage.getTabletsTxt());
		wait(400);
		String user = driver.findElement(genericPage.getUserCreateTopIcon()).getText();
		boolean createdUserIsVisible;
		
		String spreadsheetUser = excel.getCellData("User", 1);
		
		if (user.contains(spreadsheetUser)) {
			createdUserIsVisible = true;
		}
		else {
			createdUserIsVisible = false;
		}
		
		assertTrue(createdUserIsVisible);
	}*/
}
