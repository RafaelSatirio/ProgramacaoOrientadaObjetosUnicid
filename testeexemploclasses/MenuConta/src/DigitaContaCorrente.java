import java.util.Scanner;

public class DigitaContaCorrente {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				int escolha, valor;
				
				ContaCorrente cc = new ContaCorrente();
				
				System.out.println("Cadastro em Conta Corrente \n\n");
				
				System.out.println("Digite o número da conta: ");
				cc.numeroConta = sc.nextInt();
				
				System.out.println("O número da conta digitado é: " + cc.numeroConta);
				
				System.out.println("Digite o limite de crédito da conta: ");
				cc.limite = sc.nextInt();
				
				System.out.println("Digite o número de gerente da conta: ");
				cc.limite = sc.nextInt();
				
				while(true) {
					System.out.println("Se deseja sacar digite 1\n");
					System.out.println("Se deseja depositar digite 2\n");
					System.out.println("Se deseja sair digite 0\n");
					escolha = sc.nextInt();
					
					if(escolha == 1) {
						System.out.println("Digite o valor que deseja sacar");
						;
						cc.saqueConta(sc.nextDouble());
					}else if(escolha == 2){
						System.out.println("Digite o valor que deseja depositar");
						cc.depositaConta(sc.nextDouble());
					}else if(escolha == 0){
						System.out.println("Saindo do sistema..");
						break;
					}else {
						System.out.println("Opção inválida. tente novamente!");
					}
				}
			
				sc.close(); 
			}
}

