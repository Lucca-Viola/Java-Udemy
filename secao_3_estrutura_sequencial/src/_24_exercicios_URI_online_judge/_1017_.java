package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1017_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		double litrosGastos = (velocidadeMedia * tempoGasto) / 12.0;
		
		System.out.printf("%.3f%n", litrosGastos);
		
		sc.close();
	}

}