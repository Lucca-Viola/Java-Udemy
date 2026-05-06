package _24_exercicios_URI_online_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1010_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1, p2, n1, n2;
		double v1, v2, v3;
		
		p1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		p2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		v3 = (n1*v1)+(n2*v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", v3);
		sc.close();
	}
}
