package org.learning;

public class Tired implements State {
	private Tamagotchi tamagotchi;

	@Override
	public void play() {
		System.out.println("No Quiero Jugar!");
	}

	@Override
	public void feed() {
		System.out.println("No Quiero Comer");
	}

	@Override
	public void sleep() {
		System.out.println("Buenas Noches ...");
		tamagotchi.setState(new Sleep());
	}

	@Override
	public void howAreYou() {
		System.out.println("Tengo Sueño");

	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;

	}

}
