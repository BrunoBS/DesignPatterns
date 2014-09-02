package br.com.brunobs.designpatterns.decorator.usecabeca;

public class ChocolateDecor extends Bebidas {

	private Bebidas bebida;

	public ChocolateDecor(Bebidas bebida) {
		super();
		this.bebida = bebida;
	}

	@Override
	public double preco() {
		return bebida.preco() + 1.50;
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Chocolate";

	}

}
