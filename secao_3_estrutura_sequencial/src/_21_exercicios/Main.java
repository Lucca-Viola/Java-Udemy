package _21_exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Calculadora de área e preço m²---------");
		
		double largura;
		System.out.print("Largura do terreno: ");
		largura = sc.nextDouble();
		
		double comprimento;
		System.out.print("Comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		double precom2;
		System.out.print("Valor do metro quadrado: ");
		precom2 = sc.nextDouble();
		
		double area = largura * comprimento;
		double valor = area * precom2;
		
		System.out.printf("Área: %.2fm²%n", area);
		System.out.printf("Preço: R$%.2f%n", valor);
		
		sc.close();
	}

}
