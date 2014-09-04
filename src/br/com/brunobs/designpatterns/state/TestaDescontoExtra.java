package br.com.brunobs.designpatterns.state;

public class TestaDescontoExtra {

	public static void main(String[] args) {
		Orcamento orcamento  = new Orcamento(500.0);
		orcamento.aplicaDescontoExtra();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
		
		orcamento.finaliza();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
		
		
		
	}
}
