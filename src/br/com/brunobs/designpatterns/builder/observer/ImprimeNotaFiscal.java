package br.com.brunobs.designpatterns.builder.observer;

import br.com.brunobs.designpatterns.builder.NotaFiscal;

public class ImprimeNotaFiscal  implements AcaoAposGerarNota {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprime a nota");
	}

}
