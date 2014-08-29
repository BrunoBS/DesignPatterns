package br.com.brunobs.designpatterns.chain.desconto;

public class CalculadorDesconto {
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.descontar(orcamento);
	}
}
