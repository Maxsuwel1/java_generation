package atividade_8_2;
import java.util.Scanner;

public class Lista1A {
// tratar condição negativa
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 < numero2) {
			
			for (int contador = 1; contador <= numero2; contador++) {
				if (contador%3 == 0 && contador%5 == 0) {
					System.out.printf("\n%d  é múltiplo de 3 e 5",contador);
				}
			}
			
		}else {
			System.out.println("Intervalo selecionado é inválido ");
			System.out.println("O primeiro número deve ser menor que o segundo");
		}
		
		
		
	}

}
