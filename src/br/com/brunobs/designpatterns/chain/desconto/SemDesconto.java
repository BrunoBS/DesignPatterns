package br.com.brunobs.designpatterns.chain.desconto;

public class SemDesconto implements Desconto {

	@Override
	public double descontar(Orcamento orcamento) {
			return 0;
	}

	public void setProximo(Desconto desconto) {
	
	}
}