package br.com.brunobs.designpatterns.decorator.usecabeca;

public class ModaDaCasa extends Bebidas {
	public ModaDaCasa() {
		this.descricao = "Moda da casa!";
	}

	@Override
	public double preco() {
		return 0.89;
	}
}
