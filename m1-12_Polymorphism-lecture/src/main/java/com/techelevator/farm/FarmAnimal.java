package com.techelevator.farm;

// All farmanimals can not sing
public abstract class FarmAnimal implements Singable{
	private String name;
	private String sound;
	private int price;
	private boolean sleeping;

	//Added price
	public FarmAnimal(String name, String sound, int price, boolean sleeping) {
		this.name = name;
		this.sound = sound;
		this.price = price;
		this.sleeping = sleeping;
	}
	
	// Abstract added as a modifier
	public abstract String eat();
	
	
	// These overrides are coming from singable, and that's why the getters were included and why
	// they are labeled as an override
	@Override
	public String getName( ) {
		return name;
	}
	
	@Override
	public final String getSound( ) {
		if (sleeping) {
			return "Zzzzz...";
		}
		return sound;
	}
	// We added Price, so a getter was created
	public int getPrice( ) {
		return price;
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
	public void sleep() {
		sleeping = true;
	}
	public void wake() {
		sleeping = false;
	}
}