package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler os valores da largura e altura
		 * de um retângulo. Em seguida, mostrar na tela o valor de
		 * sua área, perímetro e diagonal. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle x = new Rectangle();
		
		System.out.println("Insira a largura e a altura do retângulo:");
		x.largura = sc.nextDouble();
		x.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", x.area());
		System.out.printf("PERIMETRO = %.2f%n", x.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
		
		sc.close();
		
	}

}