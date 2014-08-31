package br.com.brunobs.designpatterns.strategy.duck;

public class PatoDeBorracha extends Pato {

	public PatoDeBorracha() {
		setGrasnarBehavior(new NaoGrasna());
		setVoaBehavior(new NaoVoa());
	}

	@Override
	public void display() {
		System.out.println("Eu Sou um pato Borracha...");

	}

}
