package br.com.brunobs.designpatterns.decorator;

public class ICPP extends TampleteDeImpostoCondicional {

	public ICPP() {
	}

	public ICPP(Imposto outroImposto) {
		this.imposto = outroImposto;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
