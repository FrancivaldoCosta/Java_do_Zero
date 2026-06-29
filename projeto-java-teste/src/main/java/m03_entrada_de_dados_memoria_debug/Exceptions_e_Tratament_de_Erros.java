package m03_entrada_de_dados_memoria_debug;

public class Exceptions_e_Tratament_de_Erros {

	public static void main(String[] args) throws Exception {

		/* O que é Exception = Erros do sistema */
//		
//		try {
//
//			int x = 10 / 0;
//
//			System.out.println(x);
//		} catch (Exception e) {
//			throw new Exception("Não pode ser dividido por zero");
//
//		}
		
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.nome = "Alex";
//		
//		
//		
//		System.out.println(pessoa.nome);
		
		
//		int numero = Integer.parseInt("50");
//		System.out.println(numero);
		
		
		int numero[] = new int[5];
		numero[0] = 10; //1
		numero[1] = 10; //1
		numero[2] = 20; //2
		numero[3] = 60; //3
		numero[4] = 80; //4
		
		System.out.println(numero[1]);
		

	}

}
