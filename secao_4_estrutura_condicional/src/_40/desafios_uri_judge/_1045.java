package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, a, b, c;
		String resultado = "";
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			a = n1;
			b = n2;
			c = n3;
		} else if (n2 > n3) {
			a = n2;
			b = n1;
			c = n3;
		} else {
			a = n3;
			b = n1;
			c = n2;
		}
		
				
		if (a >= b + c) {
			resultado = "NAO FORMA TRIANGULO";
			System.out.println(resultado);
		} else {
			if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
				resultado = "TRIANGULO RETANGULO";
				System.out.println(resultado);
			} if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				resultado = "TRIANGULO OBTUSANGULO";
				System.out.println(resultado);
			} if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				resultado = "TRIANGULO ACUTANGULO";
				System.out.println(resultado);
			} if (a == b && a == c) {
				resultado = "TRIANGULO EQUILATERO";
				System.out.println(resultado);
			} if (a == b && a != c || a == c && a != b || b == c && b != a) {
				resultado = "TRIANGULO ISOSCELES";
				System.out.println(resultado);
			}
		}
				
		sc.close();
	}
}