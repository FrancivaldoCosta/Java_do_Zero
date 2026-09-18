package m06_array_e_matrizes_bidimensionais;

public class ex8 {

	public static void main(String[] args) {
		
		
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno("Anaão", 80);
		alunos[1] = new Aluno("Bruno", 65);
		alunos[2] = new Aluno("Carlosé", 70);
		
		for (Aluno aluno : alunos) {
			aluno.mostrarDados();
		}

	}

}
