package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;

public class NotaDois extends SacaAbstract implements Dinheiro {

	public void saca(BigDecimal valor) {
		UNIDADE = new BigDecimal(2);
		this.sacaAbstract(valor);
	}
	@Override
	public void proximo(Dinheiro dinheiro) {
		this.dinheiro = dinheiro;

	}

}
