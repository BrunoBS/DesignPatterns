package br.com.brunobs.designpatterns.decorator;

public abstract class Imposto {

	protected Imposto imposto;

	public Imposto(Imposto imposto) {
		super();
		this.imposto = imposto;
	}

	public Imposto() {
	}

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (imposto == null) {
			return 0;
		}
		return imposto.calcula(orcamento);

	}

	abstract double calcula(Orcamento orcamento);
}
