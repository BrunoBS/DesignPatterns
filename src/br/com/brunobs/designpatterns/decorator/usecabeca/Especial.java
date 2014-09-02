package br.com.brunobs.designpatterns.decorator.usecabeca;

public class Especial extends Bebidas {

	public Especial() {
		this.descricao = "Especial";
	}

	@Override
	public double preco() {
		return 2.50;
	}

}
