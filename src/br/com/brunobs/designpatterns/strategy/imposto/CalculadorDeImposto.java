package br.com.brunobs.designpatterns.strategy.imposto;

public class CalculadorDeImposto {

	public void realizaCalculoImposto(Orcamento orcamento,Imposto imposto) {
		double valor= imposto.calcula(orcamento);
		System.out.println(valor);
	}

}
