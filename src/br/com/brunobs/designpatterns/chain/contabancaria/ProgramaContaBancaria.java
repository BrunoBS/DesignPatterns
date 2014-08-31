package br.com.brunobs.designpatterns.chain.contabancaria;

public class ProgramaContaBancaria {
	public static void main(String[] args) {
		verificaResposta verificaResposta = new verificaResposta();
		verificaResposta.responde(Formato.CSV);
	}
}
