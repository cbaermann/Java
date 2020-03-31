package com.objectmaster1.package1;

public class HumanTest {
	public static void main(String[] args) {
		Human ninja = new Human("Donatello");
		Human wizard = new Human("Gandalf");
		Human samurai = new Human("Tom Cruise");
		
		wizard.attack(ninja);
		samurai.attack(wizard);
		ninja.attack(samurai);
	}
}
