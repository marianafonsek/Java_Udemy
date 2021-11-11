package exerc.fixacao;

import java.util.Scanner;


// numero negativo ou positivo
public class Ex1 {

	 public static void main(String[] args){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Digite um número");
		 int N = sc.nextInt();
		
		 
		 if (N <0) {
			 System.out.println("Número Negativo");
	}
		 else {
			 System.out.println("Número positivo");
		 }
		 
		 sc.close();
	 }	 
}
