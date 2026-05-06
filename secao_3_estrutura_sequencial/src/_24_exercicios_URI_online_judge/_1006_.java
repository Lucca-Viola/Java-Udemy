package _24_exercicios_URI_online_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1006_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,m;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		m = ((a * 2) + (b * 3) + (c * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f%n", m);
		
		sc.close();
	}

}
