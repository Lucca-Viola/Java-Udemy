package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1007_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,d,c,dd;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dd = (a*b-c*d);
		
		System.out.printf("DIFERENCA = %d%n", dd);
		
		sc.close();
	}
}
