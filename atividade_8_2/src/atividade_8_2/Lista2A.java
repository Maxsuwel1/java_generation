package atividade_8_2;

import java.util.Scanner;

public class Lista2A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade = 0;
        int quantidade21 = 0;
        int quantidade50 = 0;
        
        while (idade >= 0) { 
            System.out.print("Digite sua idade (Digite uma idade negativa para encerrar): ");
            idade = scanner.nextInt();
                      
            if (idade < 21) {
                quantidade21++;
            } else if (idade > 50) {
                quantidade50++;
            }
        }
        
        quantidade21 = quantidade21 - 1;
        System.out.printf("\nTotal de pessoas menores de 21 anos: %d%n", quantidade21);    
        System.out.printf("Total de pessoas maiores de 50 anos: %d%n", quantidade50);
        
        scanner.close();
    }
}
