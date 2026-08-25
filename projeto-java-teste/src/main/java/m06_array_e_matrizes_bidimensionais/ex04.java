package m06_array_e_matrizes_bidimensionais;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class ex04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] valores = new int[5];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Qual o numero na posição " + i + "? ");
			
			valores[i] = scanner.nextInt();
						
		}
		
		System.out.println("=======================================");
		System.out.print("Valores digitados: ");
		
		
		for (int n : valores) {
			System.out.print(n + ", ");
			
		}
	}
	
	

}
