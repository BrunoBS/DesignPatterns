package br.com.brunobs.designpatterns.decorator.usecabeca;

public abstract class Bebidas {
	protected String descricao = "Bebida desconhecida!";

	public String getDescricao() {
		return descricao;
	}

	public abstract double preco();

}
