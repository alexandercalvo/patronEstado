package org.learning;

public class TestTamagotchi {
	public static void main(String[] args) {
		Tamagotchi tamagotchi = new Tamagotchi();
		new Menu(tamagotchi).display();
	}
}
