package br.advantageshopping.core;

import br.advantageshopping.utils.Generic;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Driver {
	
	@Before
	public static void launchBrowser (Scenario test) {
		System.out.println("Test start: " + test.getName());
	}
	
	@After
	public static void endsTest (Scenario test) {
		new Generic().screenShot(test.getStatus(), test.getName());
		System.out.println("Test status: " + test.getStatus());
		closeChrome();
	}
}
