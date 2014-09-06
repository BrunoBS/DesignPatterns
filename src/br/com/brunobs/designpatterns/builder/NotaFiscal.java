package br.com.brunobs.designpatterns.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double valorImposto;
	public List<ItemDaNota> itens;
	private String observacoes;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, double valorBruto, double valorImposto, List<ItemDaNota> itens,
			String observacoes) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.valorImposto = valorImposto;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

}
