package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;

public interface Investimento {
	BigDecimal calcula(Conta conta);
}
