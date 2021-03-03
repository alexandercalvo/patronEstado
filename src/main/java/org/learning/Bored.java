package org.learning;

public class Bored  implements State{
	private Tamagotchi tamagotchi;

	@Override
	public void play() {
		System.out.println("JUGUEMOS......");
		tamagotchi.setState(new Tired());
		
	}

	@Override
	public void feed() {
	
		System.out.println("No quiero Comer!");
	}

	@Override
	public void sleep() {
	 System.out.println("No quiero dormir");
		
	}

	@Override
	public void howAreYou() {
		System.out.println("Estoy Aburrido !! Quiero Jugar");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
		
	}

}
