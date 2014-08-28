package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;

public class NotaDez extends SacaAbstract implements Dinheiro {

	public void saca(BigDecimal valor) {
		UNIDADE = new BigDecimal(10);
		this.sacaAbstract(valor);
	}

	@Override
	public void proximo(Dinheiro dinheiro) {
		this.dinheiro = dinheiro;

	}

}
