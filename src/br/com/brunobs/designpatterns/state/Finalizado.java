package br.com.brunobs.designpatterns.state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento finalizado não recebem desconto extra!");

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado!");

	}

}
