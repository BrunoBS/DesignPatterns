package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;

public interface Dinheiro {
	
	void saca(BigDecimal valor);
	void proximo(Dinheiro dinheiro);
	
}