package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1010_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroPecaUm = sc.nextInt();
		int quantidadePecasUm = sc.nextInt();
		double precoPecaUm = sc.nextDouble();

		int numeroPecaDois = sc.nextInt();
		int quantidadePecasDois = sc.nextInt();
		double precoPecaDois = sc.nextDouble();
		
		double valorFinal = (quantidadePecasUm * precoPecaUm) + (quantidadePecasDois * precoPecaDois);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
		
		sc.close();
	}

}
