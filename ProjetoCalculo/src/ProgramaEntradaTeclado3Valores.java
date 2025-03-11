
import java.util.Scanner;

public class ProgramaEntradaTeclado3Valores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Operações entre 3 Valores Digitados");
		
		System.out.println("Digite o n°1: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o n/2: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o n°3: ");
		n3 = sc.nextInt();
		
		System.out.println("A soma entre os 3 valores é: " + (n1 + n2 + n3));
		System.out.println("A subtração entre os 3 valores é: " + (n1 - n2 - n3));
		System.out.println("A divisão entre os 3 valores é: " + (n1 / n2 / n3));
		System.out.println("A multiplicação entre os 3 valores é: " + (n1 * n2 * n3));
	}

}
