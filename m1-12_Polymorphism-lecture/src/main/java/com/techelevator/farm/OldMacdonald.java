package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {
		
		FarmAnimal cow = new Cow();
		cow.
		
		// We added an argument that the constructor now called
		// We added the sheep class we created to this array
		Singable[] thingsThatCanSing = new Singable[] { new Cow(true), new Chicken(), new Sheep(), new Tractor(), new Cat(true) };
		
		// When each class is created, the constructor is created to store the objects
		// are called. They are sharing one class
		for(Singable singer : thingsThatCanSing) {
			String name = singer.getName();
			String sound = singer.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+sound+" "+sound+" here");
			System.out.println("And a "+sound+" "+sound+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			System.out.println();
		}
		System.out.println("\n-------------------\n");
		
		
		// Different objects and created new objects
		Sellable[] thingsToSell = new Sellable[] { new Cow(), new Chicken(), new Tractor(), new Apple() };
		for (Sellable item : thingsToSell) {
		System.out.println("The " + item.getName() + " costs $" + item.getPrice());
		}
		
		
		// These ALL the same ONE object -- different views (or 'perspectives')
		Chicken chicken = new Chicken();
		// Casting FarmAnimal - new variable name - to store chicken
		// They are parents of these, so we do NOT have to be explicit
		// We are casting from something specific to something generic
		FarmAnimal chickensAsFarmAnimal = chicken;
		Sellable chickensAsSellable = chicken;
		Singable chickenAsSingable = chicken;
		// Reversing the casting, if we know that it exists, we can cost chicken back into a new variable
		// We have to be explicit
		Chicken chickenTwo = (Chicken) chickenAsSingable;
		
		System.out.println(chicken instanceof Singable);
		
		
	}
}