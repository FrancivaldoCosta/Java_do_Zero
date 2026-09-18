package m06_array_e_matrizes_bidimensionais;

public class ex7 {

	public static void main(String[] args) {

		/* Fazer a média das notas */
		
		int[] notas = new int[4];
		notas[0] = 90;
		notas[1] = 40;
		notas[2] = 75;
		notas[3] = 66;
		
		/* Média é igual a soma dividida pela quantidade */
		
		/* Soma e dividão o resultado é número quebrado */
		
		double total = 0; 
			
		for (int n : notas) {
			total += n;
		}

		double media = total / notas.length;
		
		System.out.println("Méédia = " + media);
}

}
