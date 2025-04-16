package atividade_8_2;

import java.util.Scanner;

public class Lista3A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int valor = 0;
        
        do { 
        	
        	System.out.print("Digite número inteiro (Digite númeor 0 para encerrar): ");
            valor = scanner.nextInt();
            
            if (valor > 0) {
            	soma += valor;
        	}
          
                      
        } while (valor != 0);
        
        
        System.out.printf("\nA soma dos números positivos é: %d", soma);
       
        scanner.close();
    }
}
