package _35.exercicio_2;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Desafio 1036
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numeroUm, numeroDois, numeroTres, delta, r1, r2;
		
		numeroUm = sc.nextDouble();
		numeroDois = sc.nextDouble();
		numeroTres = sc.nextDouble();
		
		delta = (Math.pow(numeroDois, 2)) - (4 * numeroUm * numeroTres);
		r1 = ((numeroDois * -1) + (Math.sqrt(delta))) / (2 * numeroUm);
		r2 = ((numeroDois * -1) - (Math.sqrt(delta))) / (2 * numeroUm);
		
		if (delta < 0 || numeroUm == 0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
