package atividade_9_2;

import java.util.Scanner;

public class Lista2A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetorInteiros[][] = {{1,2,3}, {4,5,6}, {7,8,9}}; 
        int somaSecundario = 0;
        int somaPrincipal = 0;

        System.out.println("\nElementos da Diagonal Principal: ");
        for (int i = 0; i < 3; i++) { 
            System.out.print(vetorInteiros[i][i] + " ");
            somaPrincipal += vetorInteiros[i][i];
        }

        
        System.out.println("\nElementos da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) { 
            System.out.print(vetorInteiros[i][2 - i] + " ");
            somaSecundario += vetorInteiros[i][2 - i];
        }

        System.out.printf("\n\nSoma dos elementos da Diagonal Principal: %d", somaPrincipal);
        System.out.printf("\nSoma dos elementos da Diagonal Secundária: %d", somaSecundario);

        scanner.close();
    }
}
