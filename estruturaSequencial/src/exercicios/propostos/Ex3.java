package exercicios.propostos;

import java.util.Scanner;

public class Ex3 {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int R;
		
		System.out.println("Digite 4 numeros");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		R = (a*b - c*d);
		System.out.println("A diferen�a do produto dos numeros digitado �:" + R);
		
		sc.close();
	}
}
