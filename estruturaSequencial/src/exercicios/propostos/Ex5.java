package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	static public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codp1;
		int qntdp1;
		double valorp1;
		int codp2;
		int qntdp2;
		double valorp2;
		double valorpago;
		
		System.out.println("Digite o código da peça 1");
		codp1 = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças 1");
		qntdp1 = sc.nextInt();
		
		System.out.println("Digite o valor unitario da peça 1");
		valorp1 = sc.nextInt();
		
		
//		peça 2
		
		System.out.println("Digite o código da peça 2");
		codp2 = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças 2");
		qntdp2 = sc.nextInt();
		
		System.out.println("Digite o valor unitario da peça 2");
		valorp2 = sc.nextInt();
		
		
//		valor total pago
		valorpago = (qntdp1*valorp1 + qntdp2*valorp2);
		System.out.println("O valor final a ser pago é de:" + valorpago);
		
		
		sc.close();
	}
}	
