package _36.operadores_atribuicao_cumulativa;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorContaTelefone = 50.00;
		int tempoTelefone = sc.nextInt();

		if (tempoTelefone <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f%n", valorContaTelefone);
		}
		
		else {
			valorContaTelefone += (tempoTelefone - 100) * 2;
			System.out.printf("Valor a pagar: R$ %.2f%n", valorContaTelefone);
		}
		
		sc.close();
	}

}
