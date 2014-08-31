package br.com.brunobs.designpatterns.chain.desconto;

public class DescontoPorVendaCasada extends DescontoTamplateMethod {

	@Override
	public double valorDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean temDesconto(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getDescricao().equals(nomeDoItem))
				return true;
		}
		return false;
	}


}
