package br.com.brunobs.designpatterns.chain.desconto;

public class DescontoPorCincoItens implements Desconto {
	private Desconto proximo;

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public double descontar(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			System.out.println(this.getClass().getSimpleName());
			return orcamento.getValor() * 0.1;
		} else {
			return proximo.descontar(orcamento);
		}
	}

}
