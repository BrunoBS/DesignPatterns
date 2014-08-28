package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SacaAbstract {
	protected BigDecimal UNIDADE;
	protected Dinheiro dinheiro;

	public void sacaAbstract(BigDecimal valor) {
		UNIDADE = UNIDADE.divide(BigDecimal.ONE, 2, RoundingMode.HALF_UP);
		BigDecimal valorRestante = valor.remainder(UNIDADE);
		valorRestante = valorRestante.divide(BigDecimal.ONE, 2, RoundingMode.HALF_UP);
		valor = valor.divide(BigDecimal.ONE, 2, RoundingMode.HALF_UP);
		if (valor.compareTo(UNIDADE) >= 0) {
			int quantidade = valor.divide(UNIDADE, 2, RoundingMode.HALF_UP).intValue();
			System.out.printf(this.getClass().getSimpleName() + ":  %s \n", quantidade);
		}

		if (valor.compareTo(BigDecimal.ZERO) > 0) {
			dinheiro.saca(valorRestante);
		}

	}
}
