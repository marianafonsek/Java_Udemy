package exerc.fixacao;

import java.util.Scanner;

// diz se os numeros são multiplos ou não
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		int N1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		int N2 = sc.nextInt();

		if (N1%N2 == 0 || N2%N1 == 0) {
			System.out.println("Os numeros digitados são multiplos");
		}
		else {
			System.out.println("Os números digitados não são multiplos");
		}	
		sc.close();
	}

}
