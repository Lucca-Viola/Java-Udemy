package _24_exercicios_URI_online_judge;

import java.util.Scanner;

public class _1061_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int diaUm, horaUm, minutoUm, segundoUm, diaDois, horaDois, minutoDois, segundoDois, tempoUm, tempoDois, tempoFinal, segundoFinal, minutoFinal, horaFinal, diaFinal;
		String lixo;
		
		lixo = sc.next();
		diaUm = sc.nextInt();
		horaUm = sc.nextInt();
		lixo = sc.next();
		minutoUm = sc.nextInt();
		lixo = sc.next();
		segundoUm = sc.nextInt();
		
		lixo = sc.next();
		diaDois = sc.nextInt();
		horaDois = sc.nextInt();
		lixo = sc.next();
		minutoDois = sc.nextInt();
		lixo = sc.next();
		segundoDois = sc.nextInt();
		
		tempoUm = (diaUm * 24 * 60 * 60) + (horaUm * 3600) + (minutoUm * 60) + segundoUm;
		tempoDois = (diaDois * 24 * 60 * 60) + (horaDois * 3600) + (minutoDois * 60) + segundoDois;
		
		tempoFinal = tempoDois - tempoUm;
		
		segundoFinal = tempoFinal % 60;
		tempoFinal -= segundoFinal;
		minutoFinal = (tempoFinal / 60) % 60;
		tempoFinal = (tempoFinal / 60) - minutoFinal;
		horaFinal = (tempoFinal / 60) % 24;
		tempoFinal = (tempoFinal / 60) - horaFinal;
		diaFinal = tempoFinal / 24;
		
		System.out.println(diaFinal + " dia(s)");
		System.out.println(horaFinal + " hora(s)");
		System.out.println(minutoFinal + " minuto(s)");
		System.out.println(segundoFinal + " segundo(s)");
		
		sc.close();
	}

}
