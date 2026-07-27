package m05_estrutura_repeticao_for_e_while;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		/* Do-while */

		/* Vamos fazer um MENU, para sair do MENU digite ZERO(0) */
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		do { /* Sempre vai executar pelo menos uma vez o código interno */

			if (opcao == -1) {
				System.out.println(" ============ MENU ============ ");
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Listar");
				System.out.println("3 - Remover");
				System.out.println("0 - Sair (Encerrar)");
				System.out.print("Escolha uma opção: ");
			}

			if (opcao == 1) {
				System.out.println("Opção escolhida é: Cadastrar");
				System.out.print("Escolha uma opção: ");
			} else if (opcao == 2) {
				System.out.println("Opção escolida é: Listar");
				System.out.print("Escolha uma opção : ");
			} else if (opcao == 3) {
				System.out.println("Opção escolhida é: Remover");
				System.out.print("Escolha uma opção : ");
			} else if (opcao != -1) {
				System.out.println("Opção inválida");
				System.out.print("Escolha uma opção válida : ");
			}

			opcao = scanner.nextInt();

		} while (opcao != 0);

		scanner.close();
		System.out.println("Saindo do sistema, encerrado!");

	}

}
