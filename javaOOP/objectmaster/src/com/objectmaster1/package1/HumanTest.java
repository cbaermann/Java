package com.objectmaster1.package1;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human("Toby");
		Human h2 = new Human("Michael");
		Human h3 = new Human("Dwight");
		Ninja n = new Ninja("Donatello");
		Ninja n2 = new Ninja("Michaelangelo");
		Ninja n3 = new Ninja("Raphael");
		Wizard w = new Wizard("Gandalf");
		Wizard w2 = new Wizard("Saruman");
		Wizard w3 = new Wizard("Radagast");
		Samurai s = new Samurai("Tom Cruise");
		Samurai s2 = new Samurai("Blade");
		Samurai s3 = new Samurai("Matt Damon");
		
		h.attack(s3);
		w.fireball(n2);
		n2.steal(h2);
		s.attack(h3);
		w2.heal(n2);
		w3.fireball(n3);
		s3.howMany();
		s3.deathBlow(n);
		s2.meditate();
		n.runAway();
		s3.howMany();
	}
}
