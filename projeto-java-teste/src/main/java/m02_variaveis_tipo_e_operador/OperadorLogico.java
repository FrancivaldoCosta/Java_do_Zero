package m02_variaveis_tipo_e_operador;

public class OperadorLogico {

	public static void main(String[] args) {
		
		// Operadores lógicos & e &&
		// O operador & -> Avalia os dois lados da condição (Avalia sempre os dois lados)
		// O operador && -> Se a primeira condição for falsa, ele não avalia a segunda (Não avalia os dois lados)
		
//		if (idadeMaior18() && possuiCarteira()) {
//			System.out.println("Liberado pra dirigir");
//		} 
//		
//	}
//	
//	
//
//	public static boolean idadeMaior18() {
//		System.out.println("Chamou o método da idade");
//		return false;
//	}
//	
//	public static boolean possuiCarteira() {
//		System.out.println("Chamou o método possui carteira");
//		return true;
//	}

		int idade = 18;
		boolean possuiCarteira = false;
		boolean permissaoEspecial = true;
		
		if (idade >= 18 && possuiCarteira || permissaoEspecial) {
			System.out.println("Permitido dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}
		
		
		
	}

}
