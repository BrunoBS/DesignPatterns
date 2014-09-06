package br.com.brunobs.designpatterns.builder.observer;

import br.com.brunobs.designpatterns.builder.NotaFiscal;

public class EnviarNotaFiscalPorSMS  implements AcaoAposGerarNota {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei  nota por SMS");
	}

}
