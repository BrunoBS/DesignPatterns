package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;

public class NotaZero extends SacaAbstract implements Dinheiro {

	public void saca(BigDecimal valor) {
		System.out.printf("Fim!");
		
	}

	@Override
	public void proximo(Dinheiro dinheiro) {
		this.dinheiro = dinheiro;

	}

}
