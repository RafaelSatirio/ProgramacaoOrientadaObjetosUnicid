package pacote;

import java.util.Scanner;

public class ArrayVariavelPrimitiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = {4,40,90,8,0,12,11,10,45};
		
		System.out.println("Digite um número");
		
		int numero = sc.nextInt();
		int i = 0;
		char flag = 'n';
		
		for (i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero) {
				System.out.println("Número encontrado");
				flag = 's';
			}
		}
		if(flag=='n') {
			System.out.println("Número não encontrado");
		}
	}

}
