package testeexemploclasses;

import java.util.Scanner;

public class DigitaConta{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha, valor;
		
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println("Cadastro em Conta Poupança \n\n");
		
		System.out.println("Digite o número da conta: ");
		cp.numeroConta = sc.nextInt();
		
		System.out.println("O número da conta digitado é: " + cp.numeroConta);
		
		while(true) {
			System.out.println("Se deseja sacar digite 1\n");
			System.out.println("Se deseja depositar digite 2\n");
			System.out.println("Se deseja sair digite 0\n");
			escolha = sc.nextInt();
			
			if(escolha == 1) {
				System.out.println("Digite o valor que deseja sacar");
				valor = sc.nextInt();
				saqueConta(double valor);
			}else (escolha == 2){
				System.out
			}
		}
	
	
	}
}
