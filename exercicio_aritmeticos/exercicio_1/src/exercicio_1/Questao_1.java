package exercicio_1;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Digite o Abono: ");
		double abono = scanner.nextDouble();
		
		double novoSalario = salario + abono;
		
		System.out.println("O novo salário é: " + novoSalario);
		// Fechar scanner
		 scanner.close();
		
		
	}

}
