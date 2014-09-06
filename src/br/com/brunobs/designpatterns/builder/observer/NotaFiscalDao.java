package br.com.brunobs.designpatterns.builder.observer;

import br.com.brunobs.designpatterns.builder.NotaFiscal;

public class NotaFiscalDao  implements AcaoAposGerarNota {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salvei a nota no banco");
	}

}
