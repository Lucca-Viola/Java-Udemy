package _24_exercicios_URI_online_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1008_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int f,h;
		double hs,s;
		f = sc.nextInt();
		h = sc.nextInt();
		hs = sc.nextDouble();
		s = h * hs;
		
		System.out.printf("NUMBER = %d%n", f);
		System.out.printf("SALARY = U$ %.2f%n", s);
		sc.close();
	}

}
