package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex02 {

	public static void main(String[] args) {

		double nota = 7.9;
		
		
		if (nota >= 8.9) {
			System.out.println("Excelente, aprovado");
		} else if (nota >= 7.0) {
			System.out.println("Voçê está aprovado");
		} else if (nota >= 5.0) {
			System.out.println("Voçê está em recuperação");
		} else {
			System.out.println("Voçê está reprovado");
		}
		
		
		/*s==================ERRO COMUM DE NÃO USAR ELSE gera bugs e execução indevida==================*/
	
				if (nota >= 8.9) {
					System.out.println("Excelente, aprovado");
				} else if (nota >= 7.0) {
					System.out.println("Voçê está aprovado");
				} else if (nota >= 5.0) {
					System.out.println("Voçê está em recuperação");
				} else {
					System.out.println("Voçê está reprovado");
				}
					
				
				
				
	}

}
