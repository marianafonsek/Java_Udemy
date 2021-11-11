package exerc.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira coordenada");
		double x = sc.nextDouble();
		
		System.out.println("Digite a segunda coordenada");
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1 - primeiro quadrante");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2 - segundo quadrante");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3 - terceiro quadrante");
		}
		else {
			System.out.println("Q4 - quarto quadrante");
		}
		
		sc.close();
	}
}
