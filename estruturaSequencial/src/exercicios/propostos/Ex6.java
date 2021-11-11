package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	static public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite o valor do lado A");
		A = sc.nextDouble();
		System.out.println("Digite o valor do lado B");
		B = sc.nextDouble();
		System.out.println("Digite o valor do lado C");
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * (C * C);
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
