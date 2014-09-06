package br.com.brunobs.designpatterns.builder.observer;

import br.com.brunobs.designpatterns.builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {
	
	private double fator;
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Fator:" + this.fator + " X " + notaFiscal.getValorBruto()  + " = " + this.fator * notaFiscal.getValorBruto());

	}
	public Multiplicador(double fator) {
		this.fator = fator;
		
	}

}
