package com.objectmaster1.package1;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public Wizard(String name) {
		this.name = name;
	}
	
	//Methods
	public void heal(Human human) {
		human.setHealth(human.getHealth() + intelligence);
		System.out.println("Feel the healing power");
		System.out.println("(" + human.getName() + " had their health increased by " + this.intelligence + ".)");
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth() - (this.intelligence * 3));
	}
}
