package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestaInvestimento {

	public static void main(String[] args) {
		Investimento investimento;

		Conta conta = new Conta();
		conta.deposita(new BigDecimal(100));

		investimento = new Conservador();
		System.out.print(investimento.getClass().getSimpleName() + ": ");
		System.out.println(investimento.calcula(conta).setScale(2, RoundingMode.HALF_EVEN));

		investimento = new Moderado();
		System.out.print(investimento.getClass().getSimpleName() + ": ");
		System.out.println(investimento.calcula(conta).setScale(2, RoundingMode.HALF_EVEN));

		investimento = new Arrojado();
		System.out.print(investimento.getClass().getSimpleName() + ": ");
		System.out.println(investimento.calcula(conta).setScale(2, RoundingMode.HALF_EVEN));

	}
}
