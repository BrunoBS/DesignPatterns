package br.com.brunobs.designpatterns.builder;

public class ItemDaNotaBuilder {

	private String nome;
	private double valor;
	

	public ItemDaNotaBuilder comNome(String nome) {
		this.nome = nome;
		return this;

	}

	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;

	}

	public ItemDaNota builder() {
		if(valor <=0){
			throw new IllegalArgumentException("O valor do Item deve ser maior que R$ 0.00");
		}
		if(nome == null ||nome.isEmpty()){
			throw new IllegalArgumentException("O Nome do Item é obrigátorio!");
		}
		
		return new ItemDaNota(nome, valor);

	}

	
}
