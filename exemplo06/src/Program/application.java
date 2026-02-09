package Program;

import java.util.Locale;
import java.util.Scanner;
import Util.currencyConverter;

public class application {

	public static void main(String[] args) {
		
		/* Faça um programa para ler a cotação do dólar, e depois um valor em dólar para ser comprado por
		 * uma pessoa em reais. Indormar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
		 * que a pessoa terá que pagar 6% de IOF sobre o valor do dólar. Criar uma classe CurrencyConverter
		 * para ser responsável pelos cálculos. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		currencyConverter conversor = new currencyConverter();
		
		System.out.print("Qual é o preco do dolar? ");
		conversor.valorDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		conversor.dolarComprado = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = R$ %.2f%n", conversor.valorFinal());
		
		sc.close();

	}

}