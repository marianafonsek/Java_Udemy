package Mod6_For;

import java.util.Scanner;

public class ex2For {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;

		int in = 0;
		int out = 0;

		System.out.println("Digite a quantidade de valores que quer digitar");
		N = sc.nextInt();

		for (int i = 0; i<N; i++) {
			System.out.println("digite um valor");
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
