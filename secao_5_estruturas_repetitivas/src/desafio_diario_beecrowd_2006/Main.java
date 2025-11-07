package desafio_diario_beecrowd_2006;

import java.util.Scanner;

/**
 Isto faz parte da Competição Ideal de Consumidores de Chá Puro (da sigla em inglês ICPC), que um programa de TV local está organizando. 
 Durante o show, um bule de chá completo é preparado e são entregues uma xícara de chá para cada um dos cinco competidores. 
 Os participantes devem cheirar, saborear e avaliar a amostra, de modo a identificar o tipo de chá, que pode ser: (1) o chá branco; (2) chá verde; (3) chá preto; ou (4) chá de ervas. 
 No final, as respostas são verificadas para determinar o número de suposições corretas.

Dado o tipo de chá real e as respostas fornecidas, determinar o número de participantes que receberam a resposta correta.

Entrada
A primeira linha contém um inteiro T representando o tipo de chá (1 ≤ T ≤ 4). A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta dada por cada competidor (1 ≤ A, B, C, D, E ≤ 4).

Saída
A saída contém um inteiro representando o número de concorrentes que obtiveram a resposta correta.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		if (1 <= T && 4 >= T) {
			
		}
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int tot_cor = 0;
		
		if (A == T) {
			tot_cor += 1;
		} if (B == T) {
			tot_cor += 1;
		} if (C == T) {
			tot_cor += 1;
		} if (D == T) {
			tot_cor += 1;
		} if (E == T) {
			tot_cor += 1;
		}
		
		System.out.println(tot_cor);
		
		sc.close();
	}

}
