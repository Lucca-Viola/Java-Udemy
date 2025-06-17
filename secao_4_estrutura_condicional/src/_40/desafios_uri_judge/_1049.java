package _40.desafios_uri_judge;

import java.util.Scanner;

public class _1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavraUm = sc.nextLine();
        String palavraDois = sc.nextLine();
        String palavraTres = sc.nextLine();
        
        if (palavraUm.equals("vertebrado")) {
            if (palavraDois.equals("ave")) {
                if (palavraTres.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (palavraTres.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (palavraDois.equals("inseto")) {
                if (palavraTres.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (palavraTres.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
        
        sc.close();
    }
}
