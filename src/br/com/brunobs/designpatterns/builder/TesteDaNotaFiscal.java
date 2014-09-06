package br.com.brunobs.designpatterns.builder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.com.brunobs.designpatterns.builder.observer.AcaoAposGerarNota;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(new ArrayList<AcaoAposGerarNota>());
		ItemDaNotaBuilder itemDaNotaBuilder = new ItemDaNotaBuilder();
		NotaFiscal nf = builder.paraEmpresa("razao Social").comCnpj("cnpj").comItem(itemDaNotaBuilder.comNome("item 1").comValor(200.00).builder())
				.comItem(itemDaNotaBuilder.comNome("item 2").comValor(300.00).builder())
				.comItem(itemDaNotaBuilder.comNome("item 3").comValor(400.00).builder()).builder();

		System.out.println(nf.getRazaoSocial());
		System.out.println(nf.getValorBruto());
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(nf.getDataDeEmissao().getTime()));
	}
}
