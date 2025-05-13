package ExemploArray;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = {6,40,90,8,0,12,11,10,9,15};
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int i = 0;
		for(i = 0; i < 10; i++) {
			if(vetor[i] == numero) {
				System.out.println("O número foi encontrado");
				break;
			}
		}
		if(i == 10) {
			System.out.println("O número não foi encontrado");
		}
	}

}
