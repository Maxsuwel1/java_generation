package exercicio_4;
import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		// Ler e atribuir n1
		System.out.print("Digite número 1: ");
		double n1 = scanner.nextDouble();
		
		// Ler e atribuir n2
		System.out.print("Digite número 2: ");
		double n2 = scanner.nextDouble();
		
		// Ler e atribuir n3
		System.out.print("Digite número 3: ");
		double n3 = scanner.nextDouble();
		
		// Ler e atribuir n4
		System.out.print("Digite número 4: ");
		double n4 = scanner.nextDouble();
		
		
		// Calcular diferença de produto n1, n2, n3, n4
		double diferençaProduto = ((n1*n2) - (n3*n4));
		
		System.out.println("Diferença: " + diferençaProduto);
		
	}

}
