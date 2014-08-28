package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;

public class MoedaUm extends SacaAbstract implements Dinheiro {

	public void saca(BigDecimal valor) {
		UNIDADE = new BigDecimal(1);
		this.sacaAbstract(valor);
	}

	@Override
	public void proximo(Dinheiro dinheiro) {
		this.dinheiro = dinheiro;

	}

}
