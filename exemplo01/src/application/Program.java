package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
		   válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
		   possui a maior área. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaX, areaY;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		areaX = x.area();
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		
		areaY = y.area();
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
		
	}

}