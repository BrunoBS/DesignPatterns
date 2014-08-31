package br.com.brunobs.designpatterns.strategy.duck;

public class ProgramaDuck {
	public static void main(String[] args) {
		Pato pato = new PatoReal();
		pato.display();
		pato.voa();
		pato.grasna();
		System.out.println("\n\n\n");
		pato = new PatoDeBorracha();
		pato.display();
		pato.voa();
		pato.grasna();
		System.out.println("\n\n\n");
		pato.setVoaBehavior(new Foguete());
		pato.display();
		pato.voa();
		pato.grasna();
	}
}
