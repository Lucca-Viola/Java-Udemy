package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1006_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double MEDIA = (A * 2 + B * 3 + C * 5) / 10;
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc.close();
	}

}
