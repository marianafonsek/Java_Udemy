package exerc.fixacao;

import java.util.Scanner;


// numero negativo ou positivo
public class Ex1 {

	 public static void main(String[] args){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Digite um n�mero");
		 int N = sc.nextInt();
		
		 
		 if (N <0) {
			 System.out.println("N�mero Negativo");
	}
		 else {
			 System.out.println("N�mero positivo");
		 }
		 
		 sc.close();
	 }	 
}
