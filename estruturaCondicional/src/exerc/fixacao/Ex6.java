package exerc.fixacao;

import java.util.Scanner;

public class Ex6 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		double N = sc.nextDouble();
		
		if (N < 0 || N > 100) {
			System.out.println("Numero fora do intervalo");
		}
		else if (N <= 25) {
			System.out.println("intervalo [0,25]");
		}
		else if (N <= 50) {
			System.out.println("intervalo (25,50]");
		}	
		else if (N <= 75) {
			System.out.println("intervalo (50,75]");
		}
		else {
			System.out.println("intervalo (75,100]");
		}
		
		sc.close();
		
	}
}