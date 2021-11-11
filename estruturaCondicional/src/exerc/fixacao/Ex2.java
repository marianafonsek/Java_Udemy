package exerc.fixacao;

import java.util.Scanner;


//numero par ou impar
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int N = sc.nextInt();
//		se a sobra (%) da divisão for igual a zero é par, se não, é impar
		
		if (N%2 ==0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
	sc.close();
	}
}
