package Mod6_While;

import java.util.Scanner;

//while para leiturua de senha

public class ex1 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua senha");
	int senha = sc.nextInt();
	
	while (senha != 2002) {
		System.out.println("Senha inv�lida");
		
		System.out.println("Digite sua senha");
		senha = sc.nextInt();

	}
	
	System.out.println("Acesso Permitido");

	sc.close();
	
	}

}
