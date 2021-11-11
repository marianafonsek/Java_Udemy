package exerc.fixacao;

import java.util.Scanner;

//le um codigo, a quantidade e apresenta o valor a ser pago no final
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo do produto");
		int COD = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto");
		int QTD = sc.nextInt();
		
		double valorFinal;
		
		if (COD == 1) {
			valorFinal = (QTD * 4);
		} 
		else if (COD == 2) {
			valorFinal = (QTD * 4.5);	
		}
		else if (COD == 3) {
			valorFinal = (QTD * 5);			
		}
		else if (COD == 4) {
			valorFinal = (QTD * 2);
		}
		
		else {
			valorFinal = (QTD * 1.5);
		}
		
		System.out.printf("O valor a ser pago é de: %.2f%n", valorFinal);
		
		sc.close();
	}
}	
