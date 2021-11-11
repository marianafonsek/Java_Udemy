package exerc.fixacao;

import java.util.Scanner;

// calcula a duração de um jogo
public class Ex4 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite a hora que o jogo começou");
			int horaInicial = sc.nextInt();
			
			System.out.println("Digite a hora que o jogo terminou");
			int horaFinal = sc.nextInt();
			
			int duracao;
			
			if (horaInicial < horaFinal) {
				duracao = horaFinal - horaInicial;
			}
			else {
				duracao = 24 - horaInicial + horaFinal;
			}
			
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
			sc.close();
		}
}
