package variaveistipoeoperador;

public class UnboxingAutoboxing {

	public static void main(String[] args) {

		int idade = 38; // unboxing
		
		Integer idadeWrapper = idade; // autoboxing
		
		
		Integer idadeWrapper2 = 39;
		
		int idade2 = idadeWrapper2; // unboxing
		
		System.out.println("Idade = " + idade2);
		
	}

}
