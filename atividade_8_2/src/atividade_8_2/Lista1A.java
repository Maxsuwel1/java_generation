package atividade_8_2;
import java.util.Scanner;

public class Lista1A {
// tratar condi��o negativa
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 < numero2) {
			
			for (int contador = 1; contador <= numero2; contador++) {
				if (contador%3 == 0 && contador%5 == 0) {
					System.out.printf("\n%d  � m�ltiplo de 3 e 5",contador);
				}
			}
			
		}else {
			System.out.println("Intervalo selecionado � inv�lido ");
			System.out.println("O primeiro n�mero deve ser menor que o segundo");
		}
		
		
		
	}

}
