package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, nf, media;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / (2.0 + 3.0 + 4.0 + 1.0);
				
		if (media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		
		else if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			
			nf = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", nf);
			
			media = (media + nf) / 2;
			
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", media);
			}
		}
			
		else if (media < 5.0) {
			media = ((int)(media * 10)) / 10.0;
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();
	}

}
