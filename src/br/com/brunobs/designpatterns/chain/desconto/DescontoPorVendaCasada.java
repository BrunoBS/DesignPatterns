package br.com.brunobs.designpatterns.chain.desconto;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;

	public void setProximo(Desconto proximo) {

		this.proximo = proximo;
	}

	public double descontar(Orcamento orcamento) {
		if (existe("CANETA", orcamento) && existe("LAPIS", orcamento)) {
			System.out.println(this.getClass().getSimpleName());

			return orcamento.getValor() * 0.05;
		} else {
			if (this.proximo != null) {
				return proximo.descontar(orcamento);
			}
			return 0;
		}
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getDescricao().equals(nomeDoItem))
				return true;
		}
		return false;
	}

}
