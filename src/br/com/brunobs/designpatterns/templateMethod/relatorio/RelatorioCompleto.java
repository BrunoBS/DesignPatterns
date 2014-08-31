package br.com.brunobs.designpatterns.templateMethod.relatorio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RelatorioCompleto extends Relatorio {

	@Override
	public void cabecalho(Banco banco) {
		System.out.println(banco.getNome());
		System.out.println(banco.getEndereco());
		System.out.println(banco.getTelefone());
	}

	@Override
	public void corpo(List<Conta> conta) {
		System.out.printf("\t|\t %s \t|\t %s \t|\t %s \t\t|\n","TITULAR", "AG.","SALDO");
		
		for (Conta c : conta) {
			System.out.printf("\t|\t %s \t|\t %s \t|\t %.2f \t|\t\n", c.getTitular(), c.getAgencia(), c.getSaldo());
		}

	}

	@Override
	public void rodape(Banco banco) {
		System.out.println(banco.getEmail());
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()));
	}

}
