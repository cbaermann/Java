package com.phone;

public class Galaxy extends Phone implements Ringable {
	
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		return getRingTone();
		
	}
	@Override 
	public String unlock() {
		return "Unlocked via however Galaxy phones work.";
		
	}
	
	@Override 
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "%battery left");
	}
	
}
