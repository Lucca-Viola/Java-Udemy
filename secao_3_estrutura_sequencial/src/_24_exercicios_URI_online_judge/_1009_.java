package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1009_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendasMes = sc.nextDouble();
		double salarioBonusVendas = (vendasMes * 0.15) + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioBonusVendas);
		
		sc.close();
	}

}
