package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;

public class NotaCem extends SacaAbstract implements Dinheiro {

	public void saca(BigDecimal valor) {
		UNIDADE = new BigDecimal(100);
		this.sacaAbstract(valor);

	}

	@Override
	public void proximo(Dinheiro dinheiro) {
		this.dinheiro = dinheiro;

	}

}