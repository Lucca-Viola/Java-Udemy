package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5;
		int par = 0;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		
		if (n1 % 2 == 0) {
			par += 1;
		} if (n2 % 2 == 0) {
			par += 1;
		} if (n3 % 2 == 0) {
			par += 1;
		} if (n4 % 2 == 0) {
			par += 1;
		} if (n5 % 2 == 0) {
			par += 1;
		}
		
		System.out.printf("%d valores pares%n", par);
		
		sc.close();
	}

}
