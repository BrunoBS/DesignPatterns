package br.com.brunobs.designpatterns.templateMethod.relatorio;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	public void cabecalho(Banco banco) {
		System.out.println(banco.getNome());
	}
	
	

	@Override
	public void corpo(List<Conta> conta) {
		System.out.printf("\t|\t %s \t|\t %s \t|\t\n","TITULAR", "AG");
		
		for (Conta c : conta) {
			System.out.printf("\t|\t %s \t|\t %s \t|\t\n", c.getTitular(), c.getAgencia());
		}

	}
	@Override
	public void rodape(Banco banco) {
		System.out.println(banco.getTelefone());
	}



}
