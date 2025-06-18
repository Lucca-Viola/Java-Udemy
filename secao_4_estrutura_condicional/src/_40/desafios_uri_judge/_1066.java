package _40.desafios_uri_judge;

import java.util.Scanner;

public class _1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,n4,n5,par,impar,positivo,negativo;
		par = 0;
		impar = 0;
		positivo = 0;
		negativo = 0;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		
		if (n1 != 0) {
			if (n1 > 0) {
				positivo += 1;
			} if (n1 < 0) {
				negativo += 1;
			} if (n1 % 2 == 0) {
				par += 1;
			} if(n1 % 2 != 0) {
				impar += 1;
			}
		} if (n1 == 0) {
			par += 1;
		} if (n2 != 0) {
			if (n2 > 0) {
				positivo += 1;
			} if (n2 < 0) {
				negativo += 1;
			} if (n2 % 2 == 0) {
				par += 1;
			} if(n2 % 2 != 0) {
				impar += 1;
			}
		} if (n2 == 0) {
			par += 1;
		} if (n3 != 0) {
			if (n3 > 0) {
				positivo += 1;
			} if (n3 < 0) {
				negativo += 1;
			} if (n3 % 2 == 0) {
				par += 1;
			} if(n3 % 2 != 0) {
				impar += 1;
			}
		} if (n3 == 0) {
			par += 1;
		} if (n4 != 0) {
			if (n4 > 0) {
				positivo += 1;
			} if (n4 < 0) {
				negativo += 1;
			} if (n4 % 2 == 0) {
				par += 1;
			} if(n4 % 2 != 0) {
				impar += 1;
			}
		} if (n4 == 0) {
			par += 1;
		} if (n5 != 0) {
			if (n5 > 0) {
				positivo += 1;
			} if (n5 < 0) {
				negativo += 1;
			} if (n5 % 2 == 0) {
				par += 1;
			} if(n5 % 2 != 0) {
				impar += 1;
			}
		} if (n5 == 0) {
			par += 1;
		}
		
		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", impar);
		System.out.printf("%d valor(es) positivo(s)%n", positivo);
		System.out.printf("%d valor(es) negativo(s)%n", negativo);
		
		sc.close();
	}
}


