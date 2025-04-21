package atividade_9_2;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1A {

	public static void main(String[] args) {
		
		// Declaração e instanciamento
		Scanner scanner = new Scanner(System.in); 
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		int posicao = 0;
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		// Verificar existencia do número na lista
		for (var indice = 0; indice < vetorInteiros.length; indice++) {
			if (numero == vetorInteiros[indice]) {
				posicao = indice;
			}
			
		}
		
		// Comunicação de resultado
		if (posicao != 0) {
			System.out.printf("O número %d está no indice %d",numero,posicao);
		}else {
			System.out.printf("O número %d não foi encontrado!",numero);
		}
		
		
	}

}
