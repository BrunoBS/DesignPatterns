package br.com.brunobs.designpatterns.chain.desconto;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public double descontar(Orcamento orcamento){
          if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
          }
          else {
            return proximo.descontar(orcamento);
          }
        }

}
