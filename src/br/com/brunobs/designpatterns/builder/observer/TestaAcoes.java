	package br.com.brunobs.designpatterns.builder.observer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.brunobs.designpatterns.builder.ItemDaNotaBuilder;
import br.com.brunobs.designpatterns.builder.NotaFiscal;
import br.com.brunobs.designpatterns.builder.NotaFiscalBuilder;

public class TestaAcoes {
	public static void main(String[] args) {

		List<AcaoAposGerarNota> todasAcoesASerExecutadas = new ArrayList<AcaoAposGerarNota>();
		
	
		todasAcoesASerExecutadas.add(new EnviadorNotaFiscalPorEmail());
		todasAcoesASerExecutadas.add(new NotaFiscalDao());
		todasAcoesASerExecutadas.add(new EnviarNotaFiscalPorSMS());
		todasAcoesASerExecutadas.add(new ImprimeNotaFiscal());
		todasAcoesASerExecutadas.add(new Multiplicador(2.0));
		todasAcoesASerExecutadas.add(new Multiplicador(5.0));
		NotaFiscalBuilder builder = new NotaFiscalBuilder(todasAcoesASerExecutadas);
		
		ItemDaNotaBuilder itemDaNotaBuilder = new ItemDaNotaBuilder();
		NotaFiscal nf = builder.paraEmpresa("razao Social").comCnpj("cnpj").comItem(itemDaNotaBuilder.comNome("item 1").comValor(200.00).builder())
				.comItem(itemDaNotaBuilder.comNome("item 2").comValor(300.00).builder())
				.comItem(itemDaNotaBuilder.comNome("item 3").comValor(400.00).builder()).builder();

		System.out.println("Valor Total da Nota " + nf.getValorBruto());
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(nf.getDataDeEmissao().getTime()));
	
	}
}
