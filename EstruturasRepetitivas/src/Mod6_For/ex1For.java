package Mod6_For;

import java.util.Scanner;

public class ex1For {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		System.out.println("Digite um numero");

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		sc.close();
	}

}
