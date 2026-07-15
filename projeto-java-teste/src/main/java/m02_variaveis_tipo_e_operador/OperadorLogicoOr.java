package m02_variaveis_tipo_e_operador;

public class OperadorLogicoOr {

	public static void main(String[] args) {

		// Operadores lógico | e ||
		// O Operador | -> Avalia os dois lados da condição (Avalia sempre os dois lados)
		// O operador || -> Se a primeira condição for true, ele não avalia a segunda (Não avalia os dois lados)
		
		
		int idade = 18;
		boolean possuiCarteira = true;
		
		if (idade18() || possuiCarteira()) {
			System.out.println("Liberado para dirigir");
		}
		
	}
	
	public static boolean idade18() {
		System.out.println("Método da idade ");
		return true;
	}
	public static boolean possuiCarteira() {
		System.out.println("Método da possuiCarteira ");
		return false;
	}

}
