package br.com.brunobs.designpatterns.templateMethod.relatorio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProgramaRelatorio {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		
		Banco banco  = new Banco("BANCOOB");
		banco.setTelefone("(44) 3032-7734");
		banco.setEndereco("Av. Duque de Caxias, 882 2º SobreLoja - Maringá-PR");
		banco.setEmail("desenvolvimento@sicoobpr.com.br");
		
		Conta c1 = new Conta();
		c1.setAgencia(4340);
		c1.setBanco(banco);
		c1.setTitular("Siglano");
		c1.setNumero(00001);
		c1.deposita(new BigDecimal(1000));
		
		Conta c2 = new Conta();
		c2.setAgencia(4340);
		c2.setBanco(banco);
		c2.setTitular("Fulando");
		c2.setNumero(00002);
		c2.deposita(new BigDecimal(1500));
		contas.add(c1);
		contas.add(c2);
		
		
		Relatorio relatorio = new RelatorioSimples();
		System.out.println("Relatorio Simples: \n");
		relatorio.imprime(banco, contas);
		
		System.out.println("\n\n\n");
		relatorio = new RelatorioCompleto();
		System.out.println("Relatorio Completo: \n");
		relatorio.imprime(banco, contas);
	}

}
