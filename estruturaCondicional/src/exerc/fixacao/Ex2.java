package exerc.fixacao;

import java.util.Scanner;


//numero par ou impar
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int N = sc.nextInt();
//		se a sobra (%) da divis�o for igual a zero � par, se n�o, � impar
		
		if (N%2 ==0) {
			System.out.println("O n�mero � par");
		}
		else {
			System.out.println("O n�mero � impar");
		}
	sc.close();
	}
}
