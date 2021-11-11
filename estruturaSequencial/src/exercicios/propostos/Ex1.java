package exercicios.propostos;

import java.util.Scanner;

public class Ex1 {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("Soma de dois numeros:");
		System.out.println("Digite o primeiro numero:");
		x = sc.nextDouble();
		
		System.out.println("Digite o segundo numero:");
		y = sc.nextDouble();
		
		z = (x + y); 
				
		System.out.println("A soma dos numeros é:" + z);
		
	}
}
