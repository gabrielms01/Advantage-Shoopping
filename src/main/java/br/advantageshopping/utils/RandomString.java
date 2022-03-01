package br.advantageshopping.utils;

public class RandomString {

	java.util.Random random = new java.util.Random();
	String characters = "abcdefghijklmnopqrstuvwxyz";
	String randomString = "";
	
	public String createRandomString (int numberOfCharacters) {
		char[] text = new char[numberOfCharacters];
		for (int i = 0; i < numberOfCharacters; i++) {
			text[i] = characters.charAt(random.nextInt(characters.length()));
		}
		for (int i = 0; i < text.length; i++) {
			randomString += text[i];
		}
		return randomString;
	}
}
