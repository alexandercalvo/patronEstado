package org.learning;

public class Tamagotchi {

	private State state;
	public Tamagotchi() {
		setState(new Bored() );
	}
	public void setState(State state) {
		this.state= state;
		this.state.setTamagotchi(this);
		
	}
	
	public void feed() {
		this.state.feed();
	}
	
	public void sleep() {
		this.state.sleep();
	}
	
	public void play() {
		this.state.play();
	}
	
	public void howAreYou() {
		this.state.howAreYou();
	}
	
	
}
