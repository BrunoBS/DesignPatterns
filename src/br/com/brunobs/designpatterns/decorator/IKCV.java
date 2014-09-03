package br.com.brunobs.designpatterns.decorator;

public class IKCV extends TampleteDeImpostoCondicional {

	public IKCV() {
	}

	public IKCV(Imposto outroImposto) {
		this.imposto = outroImposto;
	}

	private boolean temItemMaiorque100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorque100ReaisNo(orcamento);
	}
}
