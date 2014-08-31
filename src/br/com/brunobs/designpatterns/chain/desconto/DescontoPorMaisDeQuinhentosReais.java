package br.com.brunobs.designpatterns.chain.desconto;

public class DescontoPorMaisDeQuinhentosReais extends DescontoTamplateMethod {

	@Override
	public double valorDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean temDesconto(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
