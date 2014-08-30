package br.com.brunobs.designpatterns.templateMethod.imposto;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TampleteDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {

		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.0;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getDescricao())) {
				return true;
			} else {
				noOrcamento.add(item.getDescricao());
			}
		}

		return false;
	}

}
