package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	static public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codFunc;
		int horasTrab;
		double valorHora;
		double salario;
		
		System.out.println("Digite o código do funcionario");
		codFunc = sc.nextInt();
		
		System.out.println("Quantidade de horas trabalhadas");
		horasTrab = sc.nextInt();
		
		System.out.println("Digite o valor da hora de trabalho");
		valorHora = sc.nextDouble();
	
		salario = (horasTrab * valorHora);
		
		System.out.println("O funcionario " + codFunc +"recebera " +salario+ " reais de salario");
	
		
		sc.close();
	}
}
