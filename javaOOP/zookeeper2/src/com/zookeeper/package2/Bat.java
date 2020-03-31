package com.zookeeper.package2;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("Woosh woosh woosh");
		displayEnergy();
	}
	
	public void eatHuman() {
		energyLevel += 25;
		System.out.println("num num");
		displayEnergy();
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("OH NOOOOOOO");
		displayEnergy();
	}
}
