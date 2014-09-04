package br.com.brunobs.designpatterns.state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovados n�o podem ser aprovado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovados n�o podem ser reprovados novamente!");
				
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
