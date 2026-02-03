package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque). Em seguida:
   		 * • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
		   estoque)
		 * • Realizar uma entrada no estoque e mostrar novamente os dados do produto
 	 	 * • Realizar uma saída no estoque e mostrar novamente os dados do produto
 	 	 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.println("Inserir dados do produto:");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preco: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		sc.close();
		
	}

}