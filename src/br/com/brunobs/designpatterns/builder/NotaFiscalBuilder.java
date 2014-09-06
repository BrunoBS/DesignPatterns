package br.com.brunobs.designpatterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.brunobs.designpatterns.builder.observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double total;
	private double imposto;
	private String observacao;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAcoesASerExecutadas;

	public NotaFiscalBuilder(List<AcaoAposGerarNota> todasAcoesASerExecutadas) {
		this.todasAcoesASerExecutadas = todasAcoesASerExecutadas;
		this.naDataAtual();
	}
	
	public void adicionaAcaoAposGerarNota(AcaoAposGerarNota acao){
		todasAcoesASerExecutadas.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		this.total += item.getValor();
		this.imposto += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}

	private NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscalBuilder naData(Calendar calender) {
		this.data = calender;
		return this;
	}

	public NotaFiscal builder() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, total, imposto, todosItens, observacao);
		for (AcaoAposGerarNota acaoAposGerarNota : todasAcoesASerExecutadas) {
			acaoAposGerarNota.executa(nf);
		}

		return nf;
	}
}
