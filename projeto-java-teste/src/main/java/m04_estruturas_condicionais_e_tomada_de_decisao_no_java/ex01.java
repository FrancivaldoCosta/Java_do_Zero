package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex01 {
	

	public static void main(String[] args) {
		
		
		
		int idade = 17;
		
		if (idade >= 18) {  /* true e false */
			System.out.println("Maior de idade"); /* Executa se for true */
		} else {
			System.out.println("Menor de idade"); /* Executa se for false */
		}
		
		boolean usuarioAtivo = true;
		
		if (usuarioAtivo) {
			System.out.println("Usuário ativo");
		} else {
			System.out.println("Usuário não está ativo");
		}
		
		double saldoSalario = 3500;
		
		if (saldoSalario >= 3500) {
			System.out.println("Seu saldo é igual ou acima de 3500");
		} else {
			System.out.println("Seu saldo é menor que 3500");
		}
	}

}
