package br.advantageshopping.page.generics;

import org.openqa.selenium.By;

public class GenericPage {

	private By tabletsTxt = By.id("tabletsTxt");
	private By userCreateTopIcon = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
	private By btnUser = By.xpath("//*[@id=\"menuUser\"]");

	public By getBtnUser () {
		return btnUser;
	}

	public By getTabletsTxt () {
		return tabletsTxt;
	}

	public By getUserCreateTopIcon () {
		return userCreateTopIcon;
	}
}
