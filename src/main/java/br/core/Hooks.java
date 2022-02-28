package br.core;

import br.utils.Generic;
import cucumber.api.Scenario;

public class Hooks extends Driver {
	
	public static void launchBrowser (Scenario test) {
		System.out.println("Test start: " + test.getName());
	}
	
	public static void endsTest (Scenario test) {
		new Generic().screenShot(test.getStatus(), test.getName());
		System.out.println("Test status: " + test.getStatus());
		closeChrome();
	}
}
