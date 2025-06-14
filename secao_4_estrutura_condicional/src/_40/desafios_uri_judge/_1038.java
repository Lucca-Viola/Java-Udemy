package _40.desafios_uri_judge;

import java.util.Scanner;
import java.util.Locale;

public class _1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produto, qtd;
		double valPag = 0;
		
		produto = sc.nextInt();
		qtd = sc.nextInt();
		
		switch (produto) {
		case 1:
			valPag = qtd * 4.0;
			break;
		case 2:
			valPag = qtd * 4.5;
			break;
		case 3:
			valPag = qtd * 5.0;
			break;
		case 4:
			valPag = qtd * 2.0;
			break;
		case 5:
			valPag = qtd * 1.5;
			break;
		}
		
		System.out.printf("Total: R$ %.2f%n", valPag);
	}

}
