package Mod6_For;

import java.util.Scanner;


//lê N pares de numeros e calcula a divisao do primeiro pelo segundo
public class ex4For {
	static public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		System.out.println("Programa para ler N pares de numeros e mostrar a divisão entre eles");
		System.out.println("Digite a quantidade de pares que deseja informar");
		N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println("informe o primeiro par de numeros");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if (b==0) {
				System.out.println("divisão impossivel");
			} else {
				double div = (a/b);
				System.out.printf("%.1f%n", div);
			}
			
					}
		
		
		sc.close();
	}

}
