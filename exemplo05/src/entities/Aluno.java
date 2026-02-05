package entities;

public class Aluno {
	
	public String nome;
	public float nota1;
	public float nota2;
	public float nota3;
	
	public float notaFinal() {
		return nota1 + nota2 + nota3;
	}

	public float pontosFaltando() {
		if (notaFinal() < 60) {
			return 60 - notaFinal();
		} else {
			return 0;
		}
	}
	
}