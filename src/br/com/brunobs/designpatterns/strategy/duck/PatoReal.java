package br.com.brunobs.designpatterns.strategy.duck;

public class PatoReal extends Pato {

	public PatoReal() {
		setGrasnarBehavior(new Grasna());
		setVoaBehavior(new Voa());
	}

	@Override
	public void display() {
		System.out.println("Eu Sou um pato real...");
	}

}
