package _40.desafios_uri_judge;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, nf;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			n1 = 24 - n1;
			nf = n1 + n2;
		} else if (n2 - n1 == 0) {
			nf = 24;
		} else {
			nf = n2 - n1;
		}
		
		System.out.printf("O JOGO DUROU %s HORA(S)%n", nf);
		
		sc.close();
	}

}
