package _40.desafios_uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class _1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, impostoRenda;
		salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else {
			if (salario >= 2000.01 && salario <= 3000.00) {
				impostoRenda =  (salario - 2000) * 0.08;
			} else if (salario >= 3000.01 && salario <= 4500.00) {
				impostoRenda = (1000 * 0.08) + ((salario - 3000) * 0.18);
			} else {
				impostoRenda = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
			}
			
			System.out.printf("R$ %.2f%n", impostoRenda);
		}
		
		sc.close();
	}

}
