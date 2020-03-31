package com.zookeeper.package1;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The gorilla has thrown something at you!!!");
		displayEnergy();
	}
	
	public void eatBanana() {
		energyLevel += 10;
		System.out.println("The gorilla has eaten a banana and has gained energy");
		displayEnergy();
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla has climbed something and lost its energy");
		displayEnergy();
	}

}
