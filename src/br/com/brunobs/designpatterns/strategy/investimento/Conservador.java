package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;

public class Conservador implements Investimento {

	@Override
	public BigDecimal calcula(Conta conta) {
		return conta.getSaldo().multiply(new BigDecimal(0.008));
	}

}
