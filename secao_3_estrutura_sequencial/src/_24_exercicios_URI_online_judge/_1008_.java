package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1008_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		int numHoraFunc = sc.nextInt();
		double salarioHora = sc.nextDouble();
		double salario = numHoraFunc * salarioHora;
		
		System.out.printf("NUMBER = %d%n", numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
