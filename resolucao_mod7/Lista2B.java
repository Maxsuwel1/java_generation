import java.util.Scanner;

public class Lista2B{

	
	public static void main(String[] args){
		Scanner scan = new	Scanner(System.in);

		String cargo = " ";
		double salarioNovo = 0.0;


		System.out.println("****************************************************\n");
		System.out.println("           Digite somente números inteiro\n           ");
		System.out.println("****************************************************\n");

		System.out.println("Código do produto |     Produto      | Preço Unitário ");
		System.out.println("         1        | Gerente          |    10%  ");
		System.out.println("         2        | Vendedor         |     7%  ");
		System.out.println("         3        | Supervisor       |     9%  ");
		System.out.println("         4        | Motorista        |     6%  ");
		System.out.println("         5        | Estoquista       |     5%  ");
		System.out.println("         6        | Técnico de TI    |     8%  ");

		System.out.print("\nDigite nome do colaborador: ");
		String nomeColaborador = scan.nextLine();

		System.out.print("Digite código do cargo: ");
		int escolha = scan.nextInt();

		System.out.print("Digite o salário: ");
		double salario = scan.nextDouble();

		System.out.println(" ");

		switch(escolha) {

		case 1:
				cargo = "Gerente";
				salarioNovo = salario + (salario*0.10);

			break;

		case 2:
				cargo = "Vendedor";
				salarioNovo = salario + (salario*0.07);
				
			break;

		case 3:
				cargo = "Supervisor";
				salarioNovo = salario + (salario*0.09);
				
			break;

		case 4:
				cargo = "Motorista";
				salarioNovo = salario + (salario*0.06);

			break;

		case 5:
				cargo = "Estoquista";
				salarioNovo = salario + (salario*0.05);
				
			break;

		case 6:
				cargo = "Técnico de TI";
				salarioNovo = salario + (salario*0.08);
				
			break;

		default:
			System.out.println("Opção inválida");
		}

		System.out.print("\n*********************************\n");
		System.out.print("    Resultado do Novo Salário\n");
		System.out.print("*********************************\n");
		System.out.print("\nNome do colaborador: " + nomeColaborador);
		System.out.println(" ");
		System.out.print("\nCargo: " + cargo);
		System.out.println(" ");
		System.out.printf("\nSalário: R$ %.2f%n", salarioNovo);
	}
}