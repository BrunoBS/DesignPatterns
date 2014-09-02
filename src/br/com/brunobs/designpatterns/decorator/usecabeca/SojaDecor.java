package br.com.brunobs.designpatterns.decorator.usecabeca;

public class SojaDecor extends Bebidas {

	private Bebidas bebida;

	public SojaDecor(Bebidas bebida) {
		super();
		this.bebida = bebida;
	}

	@Override
	public double preco() {
		return bebida.preco() + 1.20;
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Soja";

	}

	public SojaDecor() {
		this.descricao = "SOJA";
	}

}
