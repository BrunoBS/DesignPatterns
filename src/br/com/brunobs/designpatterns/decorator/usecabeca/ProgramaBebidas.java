package br.com.brunobs.designpatterns.decorator.usecabeca;

public class ProgramaBebidas {
	public static void main(String[] args) {
		Bebidas expresso = new CafeExpresso();
		System.out.println(expresso.getDescricao() + " R$ " + expresso.preco());
		
		Bebidas bebida = new ModaDaCasa();
		bebida  = new CafeDecor(bebida);
		bebida  = new CafeDecor(bebida);
		bebida  = new SojaDecor(bebida);
		
		System.out.println(bebida.getDescricao() + " R$ " + bebida.preco());
		
		Bebidas especial = new Especial();
		especial  = new CafeDecor(especial);
		especial  = new SojaDecor(especial);
		especial  = new ChocolateDecor(especial);
		
		System.out.println(especial.getDescricao() + " R$ " + especial.preco());
		
		
	}

}
