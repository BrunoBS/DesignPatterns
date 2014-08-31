package br.com.brunobs.designpatterns.chain.desconto;

public abstract class DescontoTamplateMethod implements Desconto {

	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {
		if (temDesconto(orcamento)) {
			System.out.println(this.getClass().getSimpleName());
			return valorDesconto(orcamento);
		} else {
			if(proximo != null){
			return proximo.descontar(orcamento);
			
			}
			return 0;
		}
	}

	abstract public double valorDesconto(Orcamento orcamento);

	abstract public boolean temDesconto(Orcamento orcamento);

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
