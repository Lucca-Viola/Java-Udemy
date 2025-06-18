package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5, n6;
		int positivo = 0;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();
		
		if (n1 > 0) {
			positivo += 1;
		} if (n2 > 0) {
			positivo += 1;
		} if (n3 > 0) {
			positivo += 1;
		} if (n4 > 0) {
			positivo += 1;
		} if (n5 > 0) {
			positivo += 1;
		} if (n6 > 0) {
			positivo += 1;
		}
		
		System.out.printf("%d valores positivos%n", positivo);
		
		sc.close();
	}

}
