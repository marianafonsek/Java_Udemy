package Mod6_For;

import java.util.Scanner;

public class ex7For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Digite um numero inteiro positivo");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}

		sc.close();
	}
}
