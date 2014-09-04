package br.com.brunobs.designpatterns.state;

public class Item {

	private double valor;
	private String descricao;

	public Item(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	


	

}
