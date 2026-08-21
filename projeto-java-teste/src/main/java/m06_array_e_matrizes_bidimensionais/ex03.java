package m06_array_e_matrizes_bidimensionais;

public class ex03 {
	
	public static void main(String[] args) {
		
		int[] numeros2 = new int[4];
		numeros2[0] = 50;
		numeros2[1] = 40;
		numeros2[2] = 66;
		numeros2[3] = 75;
		
		
		//For tradicional com índice
		
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Nota na posição: " + i + ": valor -> " + numeros2[i]);
			
		}

		
		
		//For each
		
		for (int n : numeros2) {
			System.out.println("Valor com for each: " + n);
			
		}
		
		
		
	}

}
