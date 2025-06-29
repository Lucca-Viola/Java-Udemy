package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, area, perimetro;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a + b > c && a + c > b && b + c > a) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			area = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f%n", area);
		}
		sc.close();
	}

}