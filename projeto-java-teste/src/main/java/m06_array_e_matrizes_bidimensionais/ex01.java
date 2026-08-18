package m06_array_e_matrizes_bidimensionais;

public class ex01 {

	public static void main(String[] args) {
		
		int[] numeros = {10, 20, 30, 40};
		
		
		int[] numeros2 = new int[4];
		numeros2[0] = 50;
		numeros2[1] = 40;
		numeros2[2] = 30;
		numeros2[3] = 75;
		
		
			for (int i = 0; i < numeros2.length; i++) {
				System.out.println("Posição " + i + " -> Numero : " + numeros2[i]);
				
			}
			
		
	}
	
}
