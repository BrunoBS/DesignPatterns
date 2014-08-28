package br.com.brunobs.designpatterns.strategy.investimento;

import java.math.BigDecimal;

public class Conta {
	private BigDecimal saldo = BigDecimal.ZERO;
	
	
	public void deposita(BigDecimal valor){
		this.saldo = this.saldo.add(valor);
	}


	public BigDecimal getSaldo() {
		return saldo;
	}

}
