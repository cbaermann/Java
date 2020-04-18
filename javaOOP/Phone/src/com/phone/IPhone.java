package com.phone;

public class IPhone extends Phone implements Ringable{
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		return getRingTone();
		
	}
	@Override 
	public String unlock() {
		return "Unlocked via facial recognicion.";
		
	}
	
	@Override 
	public void displayInfo() {
		System.out.println("Iphone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "%battery left");
	}

}
