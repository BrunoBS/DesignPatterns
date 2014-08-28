package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;
import java.util.Random;

public class Arrojado implements Investimento {
	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	@Override
	public BigDecimal calcula(Conta conta) {
		int valor = random.nextInt(10);
		if (valor >= 0 && valor < 2) {
			return conta.getSaldo().multiply(new BigDecimal(0.5));
		}
		if (valor >= 2 && valor <= 4) {
			return conta.getSaldo().multiply(new BigDecimal(0.3));
		}
		return conta.getSaldo().multiply(new BigDecimal(0.006));
	}
	
	

}
