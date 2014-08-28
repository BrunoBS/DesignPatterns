package br.com.brunobs.designpatterns.chain.desconto;

public class TestaDescontos {
    public static void main(String[] args) {
    	CalculadorDesconto calculador = new CalculadorDesconto();

          Orcamento orcamento = new Orcamento(6);
          orcamento.adicionaItem(new Item("CANETA", 1.0));
          orcamento.adicionaItem(new Item("LAPIS", 1.0));
          orcamento.adicionaItem(new Item("CADERNO", 1.0));
          orcamento.adicionaItem(new Item("CANETA", 1.0));
          orcamento.adicionaItem(new Item("LIVRO", 1.0));
          orcamento.adicionaItem(new Item("APONTADOR", 1.0));

          double desconto = calculador.calcula(orcamento);

          System.out.printf("Total de Desconto R$ %.2f", desconto);

    }
  }