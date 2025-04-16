import java.util.Scanner;

public class Lista1B{

	public static void main(String[] args){
		Scanner scan = new	Scanner(System.in);

		System.out.println("*******************************\n");
		System.out.println("Digite somente números inteiro\n");
		System.out.println("*******************************\n");

		System.out.print("Digite um número: ");
		int numero= scan.nextInt();

		if (numero > 0){
				if (numero%2 == 0){
					System.out.println("O Número " + numero + " é par e positivo!");

				// fim do if	
				} else {
					System.out.println("O Número " + numero + " é impar e positivo!");

				// fim do else		
				}
		} else {
				if (numero%2 == 0){
					System.out.println("O Número " + numero + " é par e negativo!");

				// fim do if			
				} else {
					System.out.println("O Número " + numero + " é ímpar e negativo!");

				// fim do else		
				}

		scan.close();	
		}

	}
}