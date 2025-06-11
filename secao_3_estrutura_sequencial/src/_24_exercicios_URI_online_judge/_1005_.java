package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1005_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double MEDIA = (A * 3.5 + B * 7.5) / 11;
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		sc.close();
	}

}
