package m06_array_e_matrizes_bidimensionais;

public class ex12 {
	
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
		matriz[2][0] = 01;
		matriz[2][1] = 100;
		matriz[2][2] = 110;
		matriz[2][3] = 1120;
	

		int maior = matriz[0][0];
		int menor = matriz[0][0];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				int valor = matriz[linha][coluna]; // Temos todos os valores sendo percorridos
				
				if (valor > maior) {
					maior = valor;
				}
				
				if (valor < menor) {
					menor = valor;
				}
			}
		}
		
		System.out.println("Valor maior é: " + maior);
		System.out.println("Valor maior é: " + menor);
		
		

	}
		
		
		
	
}
