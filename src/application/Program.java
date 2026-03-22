package application;

import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("insira a quantidade de produtos: ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("insira o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("insira o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);

		}
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		double media = soma / vect.length;
		System.out.println("a média dos preços é: R$" + media);

		sc.close();
	}

}
