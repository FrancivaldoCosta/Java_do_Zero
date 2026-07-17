package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex04 {

	public static void main(String[] args) {

		/* Use IF e ELSE ou até ELSE IF quando existem muitas condições */

		String opcao = "U";

		if (opcao.equals("A")) {
			System.out.println("Administrador");

		} else if (opcao.equals("U")) {
			System.out.println("Usuário");
		} else {
			System.out.println("Inválida");
		}

//	 ===============================Usando switchcase=============================

// Use Swich Case quando precisa comparar valores ou letras 

//		String opcao2 = "U";

		switch (opcao) {

		case "A":
			System.out.println("Administrador");
			break;
		case "U":
			System.out.println("Usuário");
			break;

		default:
			System.out.println("Inválida");

		}

		/* Verifica e retorna um valor */
		String retorno = switch (opcao) {
		case "A" -> "Administrador";
		case "U" -> "Usuário";
		default -> "Inválido";

		};

		System.out.println("Valor do retorno: " + retorno);

		/* Verifica o valor, processa um método e retorna uma string */
		retorno = switch (opcao) {
		case "A" -> {
			System.out.println("Administrador");
			yield "Administrador";
		}
		case "U" -> {
			System.out.println("Usuário");
			yield "Usuário";
		}
		default -> "Inválido";

		};
		
		System.out.println("Valor do retorno 2 " + retorno);

	}
}
