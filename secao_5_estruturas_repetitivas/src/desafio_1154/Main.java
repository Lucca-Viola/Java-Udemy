package desafio_1154;

import java.util.Scanner; 
import java.util.Locale;

/**
 Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
 O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int idadeTotal = 0;
		int qtdPessoas = 0;
		
		while (idade >= 0) {
			idade = sc.nextInt();
			
			if (idade >= 0) {
				idadeTotal += idade;
				qtdPessoas++;
			}
		}
		
		System.out.printf("%.2f%n", (double)idadeTotal/qtdPessoas);
		
		sc.close();
	}
}
