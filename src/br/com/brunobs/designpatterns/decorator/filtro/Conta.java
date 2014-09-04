package br.com.brunobs.designpatterns.decorator.filtro;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Conta {
	private Calendar dataAbertura;
	private String titular;
	private double saldo;

	public Conta(String titular, double saldo, Calendar dataAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	@Override
	public String toString() {
		return "Titular: " + this.titular + "\nData de Abertura: "
				+ new SimpleDateFormat("dd/MM/yyyy").format(this.dataAbertura.getTime()) + "\nSaldo:" + saldo + "\n\n";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
