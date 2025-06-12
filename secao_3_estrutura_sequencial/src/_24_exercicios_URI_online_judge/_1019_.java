package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1019_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int horas =  tempo / 3600;
		int minutos = (tempo % 3600) / 60;
		int segundos = tempo % 3600 % 60;
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();
	}

}
