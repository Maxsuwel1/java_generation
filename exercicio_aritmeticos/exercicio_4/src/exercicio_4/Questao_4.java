package exercicio_4;
import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		// Ler e atribuir n1
		System.out.print("Digite n�mero 1: ");
		double n1 = scanner.nextDouble();
		
		// Ler e atribuir n2
		System.out.print("Digite n�mero 2: ");
		double n2 = scanner.nextDouble();
		
		// Ler e atribuir n3
		System.out.print("Digite n�mero 3: ");
		double n3 = scanner.nextDouble();
		
		// Ler e atribuir n4
		System.out.print("Digite n�mero 4: ");
		double n4 = scanner.nextDouble();
		
		
		// Calcular diferen�a de produto n1, n2, n3, n4
		double diferen�aProduto = ((n1*n2) - (n3*n4));
		
		System.out.println("Diferen�a: " + diferen�aProduto);
		
	}

}
