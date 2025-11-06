package _47.exercicio_proposto;

import java.util.Scanner;

/**
 Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indíviduo. 
 O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. 
 Se for entrando um valor negativo na primeira vez, mostrar a mensagem "impossível calcular".
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		double idade_total = 0, pessoas = 0, media = 0;
		
		if (idade <= 0) {
			System.out.println("Impossível calcular");
		} else {
			while (idade >= 0) {
				idade_total += idade;
				pessoas += 1;
				idade = sc.nextInt();
			} 
			
			media = idade_total/pessoas;

			System.out.printf("%.2f%n",media);
		}
		
		sc.close();
	}

}
