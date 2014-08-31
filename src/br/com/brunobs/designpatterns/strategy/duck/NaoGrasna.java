package br.com.brunobs.designpatterns.strategy.duck;

public class NaoGrasna  implements GrasnarBehavior{

	@Override
	public void quack() {
		System.out.println("Eu NÃO Grasno ...");
		
	}

}
