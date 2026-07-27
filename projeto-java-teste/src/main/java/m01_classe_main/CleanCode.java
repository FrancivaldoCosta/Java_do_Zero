package m01_classe_main;

import java.util.Date;

public class CleanCode {
	
	/* Nome de classe começa com letra Maiuscula */
	public static void main(String[] args) {
		
		/* Nomes limpos */
		/* Evita repetições como (quantidadeEstoque1) */
		int quantidadeEstoque = 10;
		
		/* Espaços entre os comandos */ 
		/* Evita juntar como (soma=10+20) */ 
		int soma = 10 + 20;

		System.out.println("Soma: " + soma);
			
	}
	
	/* Nome de metodos devem ser limpos, diretos, claros e especificos */
	/* Evita (procQtdPgFuncionario) */
	public static void processaPagamentoFuncionario(Date dataInicial, Date dataFinal) {
		
	}


}
