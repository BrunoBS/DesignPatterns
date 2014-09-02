package br.com.brunobs.designpatterns.decorator;

public class ISS extends Imposto {

	public ISS(Imposto imposto) {
		super(imposto);
	}

	public ISS() {
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

	
}
