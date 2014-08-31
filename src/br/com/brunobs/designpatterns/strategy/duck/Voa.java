package br.com.brunobs.designpatterns.strategy.duck;

public class Voa implements VoaBehavior{

	@Override
	public void fly() {
		System.out.println("Eu vôo ..");
		
	}

}
