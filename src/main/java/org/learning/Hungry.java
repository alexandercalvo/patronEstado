package org.learning;

public class Hungry implements State {
	private Tamagotchi tamagotchi;
	@Override
	public void play() {
		System.out.println("No Quiero Jugar");

	}

	@Override
	public void feed() {
		System.out.println("Um um um");
		tamagotchi.setState(new Bored());

	}

	@Override
	public void sleep() {
		System.out.println("No Quiero Dormir ...");
	}

	@Override
	public void howAreYou() {
		System.out.println("Dame De Comer !");
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi =tamagotchi;

	}

}
