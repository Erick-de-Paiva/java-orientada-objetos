package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto).
		 * Em seguida, mostrar os dados do funcionário(nome e salário líquido). Em seguida aumentar o
		 * salário com base em uma porcentagem dada(somente o salário bruto é afetado pela porcentagem)
		 * e mostrar novamente os dados do funcionário. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Funcionário: " + funcionario.nome + ", R$ %.2f%n", funcionario.salarioLiquido());
		
		System.out.println();
		System.out.print("Qual porcentagem de aumento salarial? ");
		funcionario.porcentagem = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Dados atualizados: " + funcionario.nome + ", R$ %.2f%n", funcionario.aumentoSalarial());
		
		sc.close();
		
	}

}