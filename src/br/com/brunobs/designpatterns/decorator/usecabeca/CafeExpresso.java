package br.com.brunobs.designpatterns.decorator.usecabeca;

public class CafeExpresso extends Bebidas {

	public CafeExpresso() {
		this.descricao = "Expresso";
	}

	@Override
	public double preco() {
		return 1.99;
	}

}
