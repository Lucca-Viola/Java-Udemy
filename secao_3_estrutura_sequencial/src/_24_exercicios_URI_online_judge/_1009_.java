package _24_exercicios_URI_online_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1009_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		double s, v, sf;
		s = sc.nextDouble();
		v = sc.nextDouble();
		sf = (v*0.15) + s;
		
		System.out.printf("TOTAL = R$ %.2f%n", sf);
		sc.close();
	}

}
