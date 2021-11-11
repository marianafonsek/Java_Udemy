package saidaDeDados;

import java.util.Locale;

public class Main {
	public static void main (String[] args) {

		int y = 32;
		double x = 10.35784;
		System.out.println(y);
//		printf faz a formataçao do texto que vai ser impresso 
		System.out.printf("%.2f%n", x);
		System.out.println("Bom dia!");
		
//		Locale - determina o tipo de ofrmatação que iremos usar
		Locale.setDefault(Locale.US);
		
		
//		para concatenar varias variaveis impressas 
		System.out.println("Resultado = "+ x + "metros");
		System.out.printf("Resultado = %.2f metros%n", x);
	}
}