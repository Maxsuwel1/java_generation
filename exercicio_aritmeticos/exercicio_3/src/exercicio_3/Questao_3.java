package exercicio_3;
import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Iniciar Scanner
		Scanner scanner = new Scanner(System.in);
		
		
		// Ler salario
		
		System.out.println("TROQUE A V�RGULA POR PONTO");
		System.out.print("Digite sal�rio: ");
		double salarioBruto = scanner.nextDouble();
				
		// Ler adicional noturno				
		System.out.print("Digite Adicional noturno: ");
		double adicionalNoturno = scanner.nextDouble();
		
		// Ler horas extras
		System.out.print("Digite Horas Extras: ");
		double horasExtra = scanner.nextDouble();
		
		// Ler descontos
		System.out.print("Digite descontos: ");
		double descontos = scanner.nextDouble();
		
		
		// Mostras salario Liquido
		double salarioLiquido = ((salarioBruto + adicionalNoturno + horasExtra) + descontos);
		System.out.print("Sal�rio l�quido: " + salarioLiquido);
		
	}

// nome.toUpperCase	
// %.2f - Mostra dois n�mero p�s v�rgula

}
