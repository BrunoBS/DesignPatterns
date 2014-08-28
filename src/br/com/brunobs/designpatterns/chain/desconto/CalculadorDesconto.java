package br.com.brunobs.designpatterns.chain.desconto;

public class CalculadorDesconto {
	 public double calcula(Orcamento orcamento) {
         Desconto d1 = new DescontoPorCincoItens();
         Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
         Desconto SemDesconto = new SemDesconto();
         d1.setProximo(d2);
         d2.setProximo(SemDesconto);
         
         return d1.descontar(orcamento);
       }
}
