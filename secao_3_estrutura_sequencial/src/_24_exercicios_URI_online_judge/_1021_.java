package _24_exercicios_URI_online_judge;

import java.util.Scanner;
import java.util.Locale;

public class _1021_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double valor = sc.nextDouble();
		int valorInt = (int) (valor * 100 + 0.5);
		
		System.out.println("NOTAS:");
		
		System.out.println(valorInt / (100*100) + " nota(s) de R$ 100.00");
		valorInt = valorInt % (100*100);
		
		System.out.println(valorInt / (50*100) + " nota(s) de R$ 50.00");
		valorInt = valorInt % (50*100);
		
		System.out.println(valorInt / (20*100) + " nota(s) de R$ 20.00");
		valorInt = valorInt % (20*100);
		
		System.out.println(valorInt / (10*100) + " nota(s) de R$ 10.00");
		valorInt = valorInt % (10*100);
		
		System.out.println(valorInt / (5*100) + " nota(s) de R$ 5.00");
		valorInt = valorInt % (5*100);
		
		System.out.println(valorInt / (2*100) + " nota(s) de R$ 2.00");
		valorInt = valorInt % (2*100);
		
		System.out.println("MOEDAS:");
		
		System.out.println(valorInt / (1*100) + " moeda(s) de R$ 1.00");
		valorInt = valorInt % (100);

		System.out.println(valorInt / (50) + " moeda(s) de R$ 0.50");
		valorInt = valorInt % (50);

		System.out.println(valorInt / (25) + " moeda(s) de R$ 0.25");
		valorInt = valorInt % (25);

		System.out.println(valorInt / (10) + " moeda(s) de R$ 0.10");
		valorInt = valorInt % (10);

		System.out.println(valorInt / (5) + " moeda(s) de R$ 0.05");
		valorInt = valorInt % (5);

		System.out.println(valorInt / (1) + " moeda(s) de R$ 0.01");
		valorInt = valorInt % (1);
		
		sc.close();
	}

}
