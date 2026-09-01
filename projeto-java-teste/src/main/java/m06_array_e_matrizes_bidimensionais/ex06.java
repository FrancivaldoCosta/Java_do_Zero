package m06_array_e_matrizes_bidimensionais;

public class ex06 {

	public static void main(String[] args) {

		int[] notas = new int[4];
		notas[0] = 90;
		notas[1] = 40;
		notas[2] = 75;
		notas[3] = 66;
		
		/* Qual será a maior nota ou número? */
		
				
		int maior = notas[0];
		
		for (int n : notas) {
			
			if (n > maior) {
				maior = n;
			}
			
		}
		
		System.out.println("A maior nota é: " + maior);
		
		
		
		
		int menor = notas[0];
	
	for (int n : notas) {
		
		if (n < menor) {
			menor = n;
		}
		
	}
	
	System.out.println("A menor nota é: " + menor);
	
}

}
