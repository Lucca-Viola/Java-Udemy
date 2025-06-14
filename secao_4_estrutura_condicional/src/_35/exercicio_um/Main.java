package _35.exercicio_um;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double notaUm, notaDois, notaFinal;
		
		notaUm = sc.nextDouble();
		notaDois = sc.nextDouble();
		notaFinal = (notaUm + notaDois);
		
		if (notaFinal >= 60.0) {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		}
		
		else {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}

}
