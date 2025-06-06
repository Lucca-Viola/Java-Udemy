package _16_saida_de_dados;

//import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		System.out.print("Teste");
		System.out.println("Teste");
		//Ao usar o 'println' uma quebra de linha é feita
		//Ao usar o 'print' não é feita uma quebra de linha, resultando em um print na mesma linha
		
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		//System.out.println("%.2f%n",x); Isso não é possível, pois o printf é usado para formatações e argumentos
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		//Locale.setDefault(Locale.US);
		//System.out.printf("%.4f%n", x);
		int num1 = 25;
		int num2 = 9;
		System.out.printf("Resultado: %d%n", num1 + num2);
		double num3 = 69.13;
		double num4 = 13.2234;
		System.out.printf("Resultado: %f%n", num3 + num4);
		System.out.printf("Resultado: %.2f%n", num3 + num4);
		
		String nome = "Lucca";
		int idade = 20;
		double renda = 1777.87;
		System.out.printf("%s tem %d anos e ganha R$%.2f por mês.%n", nome, idade, renda);
	}

}
