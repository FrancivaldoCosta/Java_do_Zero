package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex03 {
	
	public static void main(String[] args) {
		
		
		int idade = 18; /* Atribuição de valores (=) */
		
		if (idade == 18) { /* Comparção de igualdade (==) */
			System.out.println("Maior de 18 anos");
		}
		
		if (idade != 18) { /* Expressão de valores diferentes (!=) */
			
			System.out.println("Pessoa não tem 18 anos");
			
		}
		
		
		
		if (idade >= 18) {
		
			 System.out.println("Pessoa maior de idade");
		} else {
		
			System.out.println("Pessoa menor de idade");
		}
		
		String senha = "";
		
		if (senha != null && !senha.isEmpty()) {
			System.out.println("Processar e verificar a senha");
			
		} else {
			System.out.println("Senha deve ser informada");
		}
			
	}

}
