package Application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da Conta:");	
		int numeroConta =  sc.nextInt();
		
		sc.nextLine();
				
		System.out.print("Por favor, digite o número da Agência:");
		int agencia = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Por favor, digite o nome do titular da Conta:");
		String nome = sc.nextLine();
		
		System.out.print("Por favor, digite o valor do saldo da Conta:");
		double saldo = sc.nextDouble();
		
		
		System.out.println("Olá ,"
		+ nome + " " + "obrigado por criar uma conta em nosso banco, sua agência " +
		+ agencia + " " + "Conta" + " " +
		+ numeroConta + " " + "e seu saldo R$" + " " +
		+ saldo + " " +"já esta disponível para saque!");
	
		
		sc.close();
		
		

	}

}
