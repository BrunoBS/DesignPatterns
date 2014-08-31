package br.com.brunobs.designpatterns.templateMethod.relatorio;

import java.util.List;

public abstract class Relatorio {

	protected final void imprime(Banco banco, List<Conta> contas) {
		cabecalho(banco);
		corpo(contas);
		rodape(banco);

	}

	protected abstract void cabecalho(Banco banco);

	protected abstract void corpo(List<Conta> conta);

	protected abstract void rodape(Banco banco);

}
