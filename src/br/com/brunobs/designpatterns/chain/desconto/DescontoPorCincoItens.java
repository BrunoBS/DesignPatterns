package br.com.brunobs.designpatterns.chain.desconto;

public class DescontoPorCincoItens extends DescontoTamplateMethod {

	@Override
	public double valorDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean temDesconto(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}

}
