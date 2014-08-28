package br.com.brunobs.designpatterns.strategy.imposto;


/**
 * Padr�o de Projeto Strategy
 * Criar uma Strategy para cada variante e fazer com que o m�todo 
 * delegue o algoritmo para uma inst�ncia de Strategy.
 *
 * @author Bruno
 * @Email bbsgt@hotmail.com
 * @Site wwww.brunobs.com.br
 *
 */
public class TestImposto {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.realizaCalculoImposto(orcamento, icms);
		calculadorDeImposto.realizaCalculoImposto(orcamento, iss);
	}
}
