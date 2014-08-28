package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;
import java.util.Random;

public class Moderado implements Investimento {

	private Random random;

	public Moderado() {
		this.random = new Random();
	}

	@Override
	public BigDecimal calcula(Conta conta) {
		
		int nextInt = random.nextInt(2);
		if (nextInt == 0) {
			return conta.getSaldo().multiply(new BigDecimal(0.025));
		}
		return conta.getSaldo().multiply(new BigDecimal(0.007));
	}

}
