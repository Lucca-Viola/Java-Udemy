package _40.desafios_uri_judge;

import java.util.Scanner;

public class _1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h1, h2, m1, m2, hf, mf, mt;
		h1 = sc.nextInt();
		m1 = sc.nextInt();
		h2 = sc.nextInt();
		m2 = sc.nextInt();
		
		mt = (h2 * 60 + m2) - (h1 * 60 + m1);
		
		if (mt == 0) {
			hf = 24;
			mf = 0;
		} else if (mt < 0) {
			mt = 1440 - Math.abs(mt);
			mf = mt % 60;
			hf = (mt - mf) / 60;
		} else {
			mf = (mt % 60);
			hf = (mt - mf) / 60;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hf, mf);
		
		sc.close();
	}

}