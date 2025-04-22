package atividade_10_2;
import java.util.ArrayList;
import java.util.Scanner; 

public class Lista1A {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 ArrayList<String> lista = new  ArrayList<String>();
		 
		 
		 
		 for (int contador = 0; contador < 5; contador++) {
		 System.out.print("Digite uma cor: "); 
		 String input = scanner.nextLine();   
		 lista.add(input); 
		 }
		 
		 
		 // 
		 System.out.println("\nListar todas as cores\n");
		 
		 // Listar todas as cores
		 for (var item : lista) { 
			 System.out.println(item); 
		 }
		 
		 
		// Ordenar todas as cores
		 lista.sort(null); 
		 
		 System.out.println("\nOrdenar todas as cor\n"); 
		 lista.forEach(System.out::println);
		 
		 
		 scanner.close();
	}

}
