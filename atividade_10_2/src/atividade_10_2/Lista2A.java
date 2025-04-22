package atividade_10_2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista2A {

	public static void main(String[] args) {
		// Declarações
		Scanner scanner = new Scanner(System.in);
		Set<Integer> inteirosSet = new HashSet<Integer>();
		int input=0;
		
		// Receber dados do usuário
		System.out.println("###SOMENTE NÚMEROS DIFERENTES###");
	
		for (int contador = 0; contador < 10; contador++) {
			System.out.print("Digite um valor inteiro: ");
			input = scanner.nextInt();
			inteirosSet.add(input);
		}
		
		// Mostrar dados com iterator
		System.out.println("\nListar dados do Set:"); 
		
		Iterator<Integer> inteirosSetList = inteirosSet.iterator();
		
		while (inteirosSetList.hasNext()) { 

			System.out.println(inteirosSetList.next()); 

			} 
		
		scanner.close();

	}

}
