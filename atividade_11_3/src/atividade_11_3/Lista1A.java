package atividade_11_3;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista1A {
    public static void main(String[] args) {
    	
    	// Declaraçãoes e Instancias
        Queue<String> filaBanco = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;
        String cliente = null;
        int contador = 0;

        
        
        do {
        	System.out.println("\n************************************");
        	
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.println("\n************************************");

            switch (escolha) {
                case 1:
                	System.out.println("\n#####################");
                	System.out.println("Digite nome do cliente: "); 
                    cliente = scanner.nextLine();
                    filaBanco.add(cliente);
                    
                    System.out.println("\n++++++++++++++++++++++");
                    
                    System.out.println("\nFila: "); 
                    System.out.println("\n" + cliente); 
                    System.out.println("Cliente Adicionado!"); 
                                            	
                    break;
                case 2:
                    if (filaBanco.isEmpty()) {
                    	System.out.println("\n#####################");
                      	System.out.println("A Fila está vazia!");
                    	
                    }else {
                    	System.out.println("\n#####################");
                    	System.out.println("Clientes na fila:");
                    	filaBanco.forEach(System.out::println);
                    }
                	                	
                    break;
                case 3:
                	System.out.println("\n++++++++++++++++++++++");
                	filaBanco.remove();
                	System.out.println("\nFila: ");
                	filaBanco.forEach(System.out::println);                            	
                	
                    break;
                case 0:
                    
                    break;
                default:
                	 System.out.println("Tente novamente: Digite apenas números mostrados no menu");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
