package m06_array_e_matrizes_bidimensionais;

public class ex14 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][4];

//		Primeira linha da matriz
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][3] = 40;

		// Linha 1 (2)
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;

		// Linha 2 (3)
		matriz[2][0] = 90;
		matriz[2][1] = 110;

		int soma = 0;
		int quantidade = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				int valor = matriz[linha][coluna];
				if (valor > 0) {
					soma += valor;
					quantidade++;
					
				}
			}
		}

		System.out.println("A soma total de todos os elentos: " + soma);
		
		
		
		double media = soma / quantidade;
		
		System.out.println("Média dos valores da matriz: " + media);
		

	}

}
