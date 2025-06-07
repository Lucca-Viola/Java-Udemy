package _18_Entrada_de_dados;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		
		System.out.println("Calculadora de Índisse de Massa Corporal");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu peso em quilogramas: ");
		double peso = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Qual a sua altura em metros: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O seu indece de massa corporal é de %.2f%n", imc);
		
		sc.close();
	}
}