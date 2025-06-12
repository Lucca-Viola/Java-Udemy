package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1020_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dias = sc.nextInt();
		int ano = dias / 365;
		int mes = (dias % 365) / 30;
		int diasQtd = dias % 365 % 30;
		
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", diasQtd);
		
		sc.close();
	}

}
