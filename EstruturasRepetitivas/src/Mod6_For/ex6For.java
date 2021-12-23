package Mod6_For;

import java.util.Scanner;

public class ex6For {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		System.out.println("Digite um numero que deseja saber seus divisores");
		N = sc.nextInt();

		for (int i=1; i <=N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
