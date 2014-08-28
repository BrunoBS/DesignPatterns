package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;

public class RealizadorDeInvestimentos {

	public void realiza(Conta conta, Investimento investimento) {
		BigDecimal resultado = investimento.calcula(conta);

		conta.deposita(resultado.multiply(new BigDecimal(0.75)));
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}