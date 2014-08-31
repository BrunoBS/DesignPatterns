package br.com.brunobs.designpatterns.strategy.duck;

public class Foguete implements VoaBehavior {

	@Override
	public void fly() {
		System.out.println("Estou voando com um foguete!");
		
	}

}
