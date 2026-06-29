package m03_entrada_de_dados_memoria_debug;

public class Valor_vs_Referencia {
	
	public static void main(String[] args) {
		
		/* Passagem de valor */
		int x = 10;
		int y = x;
		
		y = 20;
		
		System.out.println("Valor de y é: " + y);
		
		
		/* Passagem por referência */
		Pessoa p1 = new Pessoa();
		p1.nome = "Alex Fernando";
		
		Pessoa p2 = p1;
		
		System.out.println("Valor de p2: " + p2.nome );
		System.out.println("Valor de p1: " + p1.nome );
		
		p2.nome = "Maria José";
		
		System.out.println("Valor de p2: " + p2.nome );
		System.out.println("Valor de p1: " + p1.nome );
		
		
	}

}
