package com.pokemon;

public class Pokemon {
	private String name;
	private String type;
	private Integer health; 
	
	
	private static int count;
	
	public Pokemon(String name, String type, Integer health){
		setName(name);
		setHealth(health);
		setType(type);
		count++;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	void attackPokemon(Pokemon pokemon) {
		this.health -= 10;
		System.out.println("You lowered " + pokemon + "'s health by 10!");
		
	}
	

}
