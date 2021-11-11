package exercicios.propostos;

import java.util.Scanner;

public class Ex2 {
	
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r;
		double area;
		
		System.out.println("Digite o raio do circulo:");
		r = sc.nextDouble();
		area = (3.14159 * r);
		System.out.printf("a area do circulo é: $d %.4f %n", area);
		
		sc.close();
	}
}
