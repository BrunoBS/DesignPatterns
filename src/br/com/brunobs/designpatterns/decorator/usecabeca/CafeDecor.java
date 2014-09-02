package br.com.brunobs.designpatterns.decorator.usecabeca;

public class CafeDecor extends Decorator {
	private Bebidas bebida;

	public CafeDecor(Bebidas bebida) {
		super();
		this.bebida = bebida;
	}

	@Override
	public double preco() {
		return bebida.preco() + 0.20;
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Café";

	}

}
