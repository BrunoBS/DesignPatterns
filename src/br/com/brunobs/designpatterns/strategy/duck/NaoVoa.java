package br.com.brunobs.designpatterns.strategy.duck;

public class NaoVoa implements VoaBehavior{

	@Override
	public void fly() {
		System.out.println("Eu NÃO vôo ..");
		
	}

}
