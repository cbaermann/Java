package com.objectmaster1.package1;

public class HumanTest {
	public static void main(String[] args) {
		Human human = new Human("Toby");
		Human human2 = new Human("Michael");
		Human human3 = new Human("Dwight");
		Human ninja = new Human("Donatello");
		Human ninja2 = new Human("Michaelangelo");
		Human ninja3 = new Human("Raphael");
		Human wizard = new Human("Gandalf");
		Human wizard2 = new Human("Saruman");
		Human wizard3 = new Human("Radagast");
		Human samurai = new Human("Tom Cruise");
		Human samurai2 = new Human("Blade");
		Human samurai3 = new Human("Matt Damon");
		
		human.attack(samurai3);
		wizard.fireball(ninja2);
	}
}
