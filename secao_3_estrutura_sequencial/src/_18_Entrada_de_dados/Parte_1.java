package _18_Entrada_de_dados;

import java.util.Scanner;
//import java.util.Locale;

public class Parte_1 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		System.out.print("Digite algo: ");
		x = sc.next();
		System.out.printf("Você digitou: %s%n", x);
		
		int y;
		System.out.print("Digite algo: ");
		y = sc.nextInt();
		System.out.printf("Você digitou: %d%n", y);
		
		double z;
		System.out.print("Digite algo: ");
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z);
		
		char h;
		System.out.print("Digite algo: ");
		h = sc.next().charAt(0);
		System.out.printf("Você digitou: %s%n", h);
		
		sc.close();
	}

}
