package br.com.brunobs.designpatterns.decorator.padrao;

public class Filtro {
	private String nome;
	private String tipo;
	private String valor;
	private String validador;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValidador() {
		return this.validador;
	}

	public void setValidador(String validador) {
		this.validador = validador;
	}

}
