package variaveistipoeoperador;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversaoImplicitaEexplicita {

	public static void main(String[] args) {

		
		// Conversão implícita - Quando não existe risco de perda de dados.
		int idade = 38;
		
		double valor = idade;
		
		System.out.println("Valor = " + valor);
		
		
		
		// Conversão explícita - Quando pode ocorrer perda de informações.
		double valor2 = 10.99;
		int valor2Int = (int) valor2;
		
		System.out.println("Valor2Int = " + valor2Int);
		
		BigDecimal real = new BigDecimal(valor2).setScale(2, RoundingMode.HALF_UP);
		System.out.println("Real = " + real);
	}

}
