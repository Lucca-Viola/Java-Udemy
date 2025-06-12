package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1014_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distanciaPerc = sc.nextInt();
		double combuGasto = sc.nextDouble();
		
		System.out.printf("%.3f km/l%n", distanciaPerc / combuGasto);
		
		sc.close();
	}

}
