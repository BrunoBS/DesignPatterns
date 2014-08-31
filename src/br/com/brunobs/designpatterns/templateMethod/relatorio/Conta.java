package br.com.brunobs.designpatterns.templateMethod.relatorio;

import java.math.BigDecimal;

public class Conta {
	private BigDecimal saldo = BigDecimal.ZERO;
	private String titular;
	private Integer numero;
	private Integer agencia;
	private Banco banco;
	
	public void deposita(BigDecimal valor){
		this.saldo = this.saldo.add(valor);
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	
	

}
