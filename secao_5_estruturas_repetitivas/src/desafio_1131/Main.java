package desafio_1131;

import java.util.Scanner;

/**
 A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
 Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
 Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int novoGrenal = 1;
		int grenal = 0;
		int vitoriaInter = 0;
		int vitoriaGremio = 0;
		int empates = 0;
		
		while (novoGrenal == 1) {
			int inter = sc.nextInt();
			int gremio = sc.nextInt();
			grenal += 1;
			
			if (inter > gremio) {
				vitoriaInter += 1;
			} else if (gremio > inter) {
				vitoriaGremio += 1;
			} else {
				empates += 1;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}
		
		System.out.println(grenal + " grenais");
		System.out.println("Inter:" + vitoriaInter);
		System.out.println("Gremio:" + vitoriaGremio);
		System.out.println("Empates:" + empates);
		if (vitoriaInter > vitoriaGremio && vitoriaInter > empates) {
			System.out.println("Inter venceu mais");
		} else if (vitoriaInter < vitoriaGremio && vitoriaGremio > empates) {
			System.out.println("Grmeio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();
	}

}
