package br.com.brunobs.designpatterns.templateMethod.imposto;


public class ProgramaTemplateMethod {
	public static void main(String[] args) {
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();
		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionaItem(new Item("CANETA", 400));
		orcamento.adicionaItem(new Item("CANETA", 100));
		orcamento.adicionaItem(new Item("CADERNO",5));
		orcamento.adicionaItem(new Item("CANETA", 5));

		double valorICPP = icpp.calcula(orcamento);
		double valorIKCV = ikcv.calcula(orcamento);
		double valorIHIT = ihit.calcula(orcamento);
		System.out.printf("Valor do ICPP: %.2f\n",valorICPP);
		System.out.printf("Valor do IKCV: %.2f\n",valorIKCV);
		System.out.printf("Valor do IHIT: %.2f\n",valorIHIT);
		
	}
}
