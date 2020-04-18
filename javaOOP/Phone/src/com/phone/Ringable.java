package com.phone;

public interface Ringable {
	public default String ring() {
		return "Ring ring ring";
	}
	
	public default String unlock() {
		return "Face recognized! ---Phone unlocked!";
	}

}
