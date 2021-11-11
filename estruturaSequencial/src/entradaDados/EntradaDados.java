package entradaDados;

import java.util.Scanner;

public class EntradaDados {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);

//			declara e recebe x
			String x;
			int y;
			
//			armazena x
			System.out.println("Digite seu nome:");
			x = sc.next();
//			
			System.out.println("Digite sua idade:");
			y = sc.nextInt();

//			imprime x e y
			System.out.println("Seu nome é " + x + ", você tem " + y + " anos");		
			
			
//			agora com CHAR
			char z;
			System.out.println("Digite um caracter qualquer:");
			z = sc.next().charAt(0);
			System.out.println("você digitou: " + z);
	
			sc.close();
		
		}
}
