package org.learning;

import java.util.Timer;
import java.util.TimerTask;

public class Sleep implements State {

	private Tamagotchi tamagotchi;
	@Override
	public void play() {

	}

	@Override
	public void feed() {
	
	}

	@Override
	public void sleep() {

	}

	@Override
	public void howAreYou() {
		System.out.println("Esta Durmiendo ....");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
		
		Timer  timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				Sleep.this.tamagotchi.setState(new Hungry());
				
			}
		}, 9000);
		

	}

}
