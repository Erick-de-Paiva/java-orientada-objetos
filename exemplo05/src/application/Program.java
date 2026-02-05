package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {
	
	/* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
	 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno
	 * no ano. Dizer tambem se o aluno está aprovado ou não, e em caso negativo, quantos pontos faltam para o aluno
	 * obter o mínimo para ser aprovado(que é 60% da nota). Você deve criar uma classe Aluno para resolver este problema. */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota 1º trimestre(0-30): ");
		aluno.nota1 = sc.nextFloat();
		
		System.out.print("Nota 2º trimestre(0-35): ");
		aluno.nota2 = sc.nextFloat();
		
		System.out.print("Nota 3º trimestre(0-35): ");
		aluno.nota3 = sc.nextFloat();
		
		System.out.printf("Notal final = %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f pontos%n", aluno.pontosFaltando());
		} else {
			System.out.println("Aprovado");
		}
		
		sc.close();
		
	}

}