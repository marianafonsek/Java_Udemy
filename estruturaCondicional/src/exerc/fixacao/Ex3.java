package exerc.fixacao;

import java.util.Scanner;

// diz se os numeros s�o multiplos ou n�o
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		int N1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int N2 = sc.nextInt();

		if (N1%N2 == 0 || N2%N1 == 0) {
			System.out.println("Os numeros digitados s�o multiplos");
		}
		else {
			System.out.println("Os n�meros digitados n�o s�o multiplos");
		}	
		sc.close();
	}

}
