package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1007_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int DIFERENCA = (A * B) - (C * D);
		
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);
		sc.close();
	}

}
