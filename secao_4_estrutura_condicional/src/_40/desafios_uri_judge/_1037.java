package _40.desafios_uri_judge;

import java.util.Scanner;
import java.util.Locale;

public class _1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		String intervalo = "";
		
		if (n >= 0 && n <= 100) {
			if (n >= 0 && n <= 25.0000)
				System.out.println("Intervalo [0,25]");
			else if (n >= 25.0001 && n <= 50.0000) {
				System.out.println("Intervalo (25,50]");
			}
			
			else if (n >= 50.0001 && n <= 75.0000) {
				System.out.println("Intervalo (50,75]");
			}
			
			else if (n >= 75.0001 && n <= 100) {
				System.out.println("Intervalo (75,100]");
			}
			
		}
		
		else {
			System.out.println("Fora de intervalo");
		}
		
	}

}
