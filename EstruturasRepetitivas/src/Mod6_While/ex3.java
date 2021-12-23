package Mod6_While;

import java.util.Scanner;

public class ex3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int diesel = 0;
		int alcool = 0;
		int gasolina = 0;
		int tipo;
		
		System.out.println("Escolha seu combustivel: 1.Álcool 2.Gasolina 3.Diesel, 4Fim");

		tipo = sc.nextInt();
				
		while (tipo !=4 ) {
			if (tipo == 1) {
				alcool += 1;
			}
			else if (tipo ==2) {
				gasolina += 1;
			}
			else if (tipo ==3) {
				diesel +=1;
			}
			
			tipo = sc.nextInt();
			
		}

		System.out.println("Obrigada");
		System.out.println("alcool:" +alcool);
		System.out.println("gasolina: "+gasolina);
		System.out.println("Diesel: " +diesel);
		
		

	sc.close();
	}
	}
