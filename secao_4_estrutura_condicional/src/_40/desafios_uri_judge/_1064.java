package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5, n6, media;
		int positivo = 0;
		media = 0;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();
		
		if (n1 > 0) {
			positivo += 1;
			media += n1;
		} if (n2 > 0) {
			positivo += 1;
			media += n2;
		} if (n3 > 0) {
			positivo += 1;
			media += n3;
		} if (n4 > 0) {
			positivo += 1;
			media += n4;
		} if (n5 > 0) {
			positivo += 1;
			media += n5;
		} if (n6 > 0) {
			positivo += 1;
			media += n6;
		}
		
		media = media / positivo;
		System.out.printf("%d valores positivos%n%.1f%n", positivo, media);
		
		sc.close();
	}

}
