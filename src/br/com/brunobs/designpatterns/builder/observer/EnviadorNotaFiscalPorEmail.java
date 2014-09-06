package br.com.brunobs.designpatterns.builder.observer;

import br.com.brunobs.designpatterns.builder.NotaFiscal;

public class EnviadorNotaFiscalPorEmail implements AcaoAposGerarNota {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei a nota por e-mail");
	}
}
