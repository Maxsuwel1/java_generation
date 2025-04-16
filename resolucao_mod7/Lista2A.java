import java.util.Scanner;

public class Lista2A{

	
	public static void main(String[] args){
		Scanner scan = new	Scanner(System.in);

		String produto = " ";
		double total = 0.0;


		System.out.println("****************************************************\n");
		System.out.println("           Digite somente números inteiro\n           ");
		System.out.println("****************************************************\n");

		System.out.println("Código do produto |     Produto      | Preço Unitário ");
		System.out.println("         1        | Cachorro Quente  | R$ 10.00");
		System.out.println("         2        | X-Salada         | R$ 15.00");
		System.out.println("         3        | X-Bacon          | R$ 18.00");
		System.out.println("         4        | Bauru            | R$ 12.00");
		System.out.println("         5        | Refrigerante     | R$  8.00");
		System.out.println("         6        | Suco de laranja  | R$ 13.00");

		System.out.print("\nDigite código do produto que deseja: ");
		int escolha = scan.nextInt();

		System.out.print("Digite quantidade que deseja: ");
		int quantidade = scan.nextInt();

		switch(escolha) {

		case 1:
				produto = "Cachorro Quente";
				total = quantidade * 10.00;

			break;

		case 2:
				produto = "X-Salada";
				total = quantidade * 15.00;
				
			break;

		case 3:
				produto = "X-Bacon";
				total = quantidade * 18.00;
				
			break;

		case 4:
				produto = "Bauru";
				total = quantidade * 12.00;
				
			break;

		case 5:
				produto = "Refrigerante";
				total = quantidade * 8.00;
				
			break;

		case 6:
				produto = "Suco de laranja";
				total = quantidade * 18.00;
				
			break;

		default:
			System.out.println("Opção inválida");
		}

		System.out.print("\n*************************\n");
		System.out.print("    Extrato do pedido    \n");
		System.out.print("*************************\n");
		System.out.println("\nProduto " + produto);
		System.out.println(" ");
		System.out.printf("Valor total: R$%.2f%n",total);
	}
}