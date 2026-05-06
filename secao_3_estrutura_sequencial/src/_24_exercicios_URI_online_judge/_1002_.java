package _24_exercicios_URI_online_judge;

import java.util.Scanner;
import java.util.Locale;
public class _1002_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,r;
		r = sc.nextDouble();
		a = 3.14159 * (r*r);
		
		System.out.printf("A=%.4f%n", a);
		
		sc.close();
	}

}
