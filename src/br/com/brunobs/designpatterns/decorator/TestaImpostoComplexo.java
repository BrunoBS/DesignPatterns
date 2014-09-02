package br.com.brunobs.designpatterns.decorator;


/**
 * O Padrão Decorator anexa responsabilidades
 * acionais a um objeto dinamicamaente. Os 
 * decoradores  fornecem uma alternativa flexivel 
 * de subclasse para estendera funcionalidade.
 * 
 * @author Bruno
 *
 */
public class TestaImpostoComplexo {
	public static void main(String[] args) {
		Imposto iss= new ISS(new ICMS(new ISS()));
		Orcamento orcamento = new Orcamento(500);
		double valor = iss.calcula(orcamento);
		System.out.println(valor);
	}

}
