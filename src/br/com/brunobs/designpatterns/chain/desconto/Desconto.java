package br.com.brunobs.designpatterns.chain.desconto;

public interface Desconto {
	double descontar(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
