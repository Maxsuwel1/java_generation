import java.util.Scanner;

public class Lista1A{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("*******************************\n");
		System.out.println("Digite somente números inteiros\n");
		System.out.println("*******************************\n");

		// Entrada
		System.out.print("Digite o número A: ");
		int A = scan.nextInt();

		System.out.print("Digite o número B: ");
		int B = scan.nextInt();

		System.out.print("Digite o número C: ");
		int C = scan.nextInt();

		System.out.println(" ");

		// Verificação
		if ((A+B) > C) {
			System.out.println(A +" + " + B + " = " + (A+B) +" > " + C);
			System.out.println("A Soma de A + B é Maior do que C");

		}else if ((A+B) < C) {
			System.out.println(A +" + " + B + " = " + (A+B) +" < " + C);
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println(A +" + " + B + " = " + (A+B) +" = " + C);
			System.out.println("A Soma de A + B é Igual a C");
		}

		scan.close();
	}

}