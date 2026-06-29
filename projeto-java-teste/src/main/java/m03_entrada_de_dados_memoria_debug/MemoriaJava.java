package m03_entrada_de_dados_memoria_debug;

import java.util.Scanner;

public class MemoriaJava {

	public static void main(String[] args) {
		
//		Todo objeto irá ficar na memória heap do Java
		Scanner scanner = new Scanner(System.in);
		
//		Toda variável ou método fica na Stack Memory (Memória mais rápida)
		String nome = scanner.nextLine();
		
	}
	
}
