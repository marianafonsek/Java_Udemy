package Mod6_For;

import java.util.Scanner;

public class ex3For {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		System.out.println("Prrograma para ler a nota e calcular a media de N alunos que desejar");
		System.out.println("Digite o numero de casos que deseja registrar");
		N = sc.nextInt();

		for (int i = 0; i <N; i++) {

			double a;
			System.out.println("Digite a Nota1");
			a = sc.nextDouble();
			
			double b; 
			System.out.println("Digite a Nota2");
			b = sc.nextDouble();
			
			double c; 
			System.out.println("Digite a Nota3");
			c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("a media é %.1f%n", media);
		}

		sc.close();
	}

}
