package br.com.brunobs.designpatterns.strategy.duck;

public class Grasna  implements GrasnarBehavior{

	@Override
	public void quack() {
		System.out.println("Eu Grasno ...");
		
	}

}
