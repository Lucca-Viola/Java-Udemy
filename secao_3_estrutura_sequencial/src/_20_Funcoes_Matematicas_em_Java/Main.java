package _20_Funcoes_Matematicas_em_Java;

public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.printf("Raiz quadrade de %.2f é %.2f%n", x, A);
		System.out.printf("Raiz quadrade de %.2f é %.2f%n", y, B);
		System.out.printf("Raiz quadrade de 25 é %.2f%n", C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2);
		System.out.printf("%.2f elevado à %.2f = %.2f%n", x, y, A);
		System.out.printf("%.2f elevado ao quadrado = %.2f%n", x, B);
		System.out.printf("5 elevado ao quadrado = %.2f%n", C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.printf("Valor absoluto de %.2f = %.2f%n", y, A);
		System.out.printf("Valor absoluto de %.2f = %.2f%n", z, B);
	}

}
