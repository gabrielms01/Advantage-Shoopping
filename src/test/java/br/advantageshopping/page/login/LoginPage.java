package br.advantageshopping.page.login;

import org.openqa.selenium.By;

public class LoginPage {

	private By cmpUserName = By.xpath("//input[@name='username']");
	private By cmpSenha = By.xpath("//input[@name='password']");
	private By btnLogar = By.xpath("(//*[contains(text(),'SIGN IN')])[2]");
	private By prdTablets = By.xpath("//span[@id='tabletsTxt']");
	private By prdTabletHP = By.xpath("//img[@data-ng-src='/catalog/fetchImage?image_id=3100']");
	private By addToCart = By.xpath("//button[@name='save_to_cart']");
	private By selectUser = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
	private By signOut = By.xpath("//label[@translate='Sign_out'][1]");

	public By getCmpUserName() {
		return cmpUserName;
	}

	public By getCmpSenha() {
		return cmpSenha;
	}
	
	public By getBtnLogar() {
		return btnLogar;
	}
	
	public By getPrdTablets () {
		return prdTablets; 
	}
	
	public By getPrdTabletHP () {
		return prdTabletHP;
	}
	
	public By getAddToCart () {
		return addToCart;
	}
	
	public By getSelectUser () {
		return selectUser;
	}
	
	public By getSignOut () {
		return signOut;
	}
}
