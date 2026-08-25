package m06_array_e_matrizes_bidimensionais;

public class ex05 {
	
	public static void main(String[] args) {
		
		/* Soma todos os valores desse array */
		
		int[] numeros2 = new int[4];
		numeros2[0] = 10;
		numeros2[1] = 10;
		numeros2[2] = 10;
		numeros2[3] = 10;
		
		
		int soma = 0;
		
		for (int n : numeros2) {
			
			soma += n;
		}
		
		System.out.println("Soma total = " + soma);
		
	}
	

}
