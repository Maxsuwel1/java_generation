package exercicio_2;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Digite nota 1: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite nota 2: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Digite nota 3: ");
		double nota3 = scanner.nextDouble();
		
		System.out.print("Digite nota 4: ");
		double nota4 = scanner.nextDouble();
		
		double media = ((nota1+nota2+nota3+nota4)/4);
		
		System.out.println("Média final: " + media);
	}

}
