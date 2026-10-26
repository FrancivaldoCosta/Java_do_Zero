package m06_array_e_matrizes_bidimensionais;

public class ex10 {
	
	
	public static void main(String[] args) {
		
		
		int[][] matriz = new int[3][4];
		
		
//		Primeira linha da matriz
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		
		// Linha 1 (2) 
		matriz[1][0] = 50;
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;
		
		// Linha 2 (3)
		matriz[2][0] = 90;
		matriz[2][1] = 100;
		matriz[2][2] = 110;
		matriz[2][3] = 120;
		
		
		System.out.println("Qtde de linhas: " + matriz.length);
		System.out.println("Qtde de colunas: " + matriz[1].length);
		
		int soma = 0;
		
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.println("");
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Na linha " + linha + " na coluna " + coluna + ", temos o valor de: " + matriz[linha][coluna]);
			}
		}
		
		
		
		
		
	}

}
