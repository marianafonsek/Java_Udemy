package Mod6_For;

import java.util.Scanner;

public class ex5For {
	public static void main(String [] aargs) {
	Scanner sc = new Scanner(System.in);

	int n;
	System.out.println("Digite o numero que deseja calcular o fatorial");
	n = sc.nextInt();

	int fat = 1;
	
	for(int i = 1; i<=n; i++) {
		fat = fat * i;
	}

System.out.println("o fatorial do numero " +n + " é: " + fat);

	sc.close();
}}
