import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		System.out.println("Menu de opções");
		System.out.println("Selecione o Tipo de Conta: <1> para Corrente "
				+ "<2> para Poupança "
				+ "<0> para Sair: ");
		escolha = sc.nextInt();
		
		switch(escolha){
			case 1:
				System.out.println("Chamando programa Digita Dados em Conta Corrente!");
				DigitaContaCorrente.main(args);
			case 2:
				System.out.println("Chamando programa Digita Dados em Conta Poupança!");
				DigitaConta.main(args);
			case 3:
				System.out.println("Encerrando Programa..");
				break;
		}
	}

}
