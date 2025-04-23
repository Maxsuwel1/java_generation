package atividade_11_3;

import java.util.Scanner;
import java.util.Stack;

public class Lista2A {

	public static void main(String[] args) {
		
		// Declarações e Instancias
		Scanner scanner = new Scanner(System.in); 
		Stack<String> estante = new Stack<String>(); 
		int escolha = 0;
		String livro = null;
		
		
		
		 do {
	        	System.out.println("\n************************************");
	        	
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar novo livro na estante");
	            System.out.println("2: Listar todos os livros na estante");
	            System.out.println("3: Retirar livro da estante");
	            System.out.println("0: Finalizar o programa");
	            System.out.print("Digite uma opção: ");
	            escolha = scanner.nextInt();
	            scanner.nextLine(); // Limpa o buffer do teclado
	            
	            System.out.println("\n************************************");

	            switch (escolha) {
	                case 1:
	                	 System.out.println("Texto");
	                	 livro = scanner.nextLine();
	                   	 estante.add(livro);
	                   	 
	                   	 // Mostrar adição
	                   	 System.out.println("\nPilha: ");
	                   	estante.forEach(System.out::println); 
	                   	System.out.println("\nLivro adicionado!");
	                                            	
	                    break;
	                case 2:
	                     if (estante.isEmpty()) {
	                    	 System.out.println("A estante está vazia!");
	                    	 
	                     }else {
	                    	 System.out.println("Texto");
	                    	 estante.forEach(System.out::println); 
	                     }	
	                    break;
	                case 3:
	                	 if (estante.isEmpty()) {
	                    	 System.out.println("Não há o que retirar");
	                    	 
	                     }else {
	                    	 livro = estante.pop();
	                    	 
	                    	 
	                    	// Mostrar remoção
		                   	System.out.println("\nPilha: ");
		                   	estante.forEach(System.out::println);
		                   	 System.out.println("Livro retirado da estante!");
	                     }	
	                	
	                    break;
	                case 0:
	                    
	                    break;
	                default:
	                	 System.out.println("Tente novamente: Digite um dos números do menu abaixo");
	                	 
	            }
	        } while (escolha != 0);

	        scanner.close();
	    }
	}
		