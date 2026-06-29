package m03_entrada_de_dados_memoria_debug;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Informe seu salário: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Meu nome é: " + nome + ", tenho : " + idade + " anos e meu salário é: " + salario);
		
	}

}
