package atividade_9_2;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1A {

	public static void main(String[] args) {
		
		// Declara��o e instanciamento
		Scanner scanner = new Scanner(System.in); 
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		int posicao = 0;
		
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		// Verificar existencia do n�mero na lista
		for (var indice = 0; indice < vetorInteiros.length; indice++) {
			if (numero == vetorInteiros[indice]) {
				posicao = indice;
			}
			
		}
		
		// Comunica��o de resultado
		if (posicao != 0) {
			System.out.printf("O n�mero %d est� no indice %d",numero,posicao);
		}else {
			System.out.printf("O n�mero %d n�o foi encontrado!",numero);
		}
		
		
	}

}
