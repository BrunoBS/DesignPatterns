package br.com.brunobs.designpatterns.chain.desconto;

public class Item {

	private double valor;
	private String descricao;

	public Item(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	
	public String getDescricao() {
		return descricao;
	}

	

}
