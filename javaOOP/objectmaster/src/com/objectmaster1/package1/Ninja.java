package com.objectmaster1.package1;

public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	
	public Ninja(String name) {
		this.name = name; 
	}
	
	public void steal(Human human) {
		human.setHealth(human.getHealth() - this.stealth);
		this.setHealth(this.getHealth() + this.stealth);
		System.out.println("All I hear is a whisper in the wind");
		System.out.println("(" + human.getName() + " was caught by surprise and took " + stealth + " points of damage!)");
	}
	
	public void runAway() {
		this.setHealth(-10);
	}
}
