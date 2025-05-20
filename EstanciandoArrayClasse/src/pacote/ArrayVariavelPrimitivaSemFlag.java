package pacote;

import java.util.Scanner;

public class ArrayVariavelPrimitivaSemFlag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			int vetor[] = {4,40,90,8,0,12,11,10,45};
			int i = 0;
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			for(i = 0; i < vetor.length; i++) {
				if(vetor[i] == numero) {
					System.out.println("\t Número encontrado \n");
					i = 9;
				}
			}
			if(i == vetor.length) {
				System.out.println("Número não encontrado");
			}
		} while(numero != 1000);
	}

}
