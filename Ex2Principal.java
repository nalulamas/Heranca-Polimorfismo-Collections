package Heran�aEx2;

public class Ex2Principal {

	public static void main(String[] args) {
		CachorroEx2 auau = new CachorroEx2();
		CavaloEx2 pocoto = new CavaloEx2();
		PreguicaEx2 lazy = new PreguicaEx2();
		
		System.out.println(" Especifica��es do cachorro");
		auau.setNome("Bruno");
		auau.setIdade(2);
		auau.emitirSom();
		auau.locomocao();
		
		System.out.println(" Especifica��es do Cavalo");
		pocoto.setNome("Junin");
		pocoto.setIdade(7);
		pocoto.emitirSom();
		pocoto.locomocao();
		
		System.out.println(" Especifica��es da Pregui�a");
		lazy.setNome("Jully");
		lazy.setIdade(4);
		lazy.emitirSom();
		lazy.locomocao();
	}

}
