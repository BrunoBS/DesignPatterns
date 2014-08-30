package br.com.brunobs.designpatterns.templateMethod.imposto;

public class ICPP extends TampleteDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return  orcamento.getValor()* 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return  orcamento.getValor()* 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()>500;
	}


}
