
import java.util.Scanner;

public class ProgramaEntradaProTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = 0, n2 = 0;
		
		System.out.println("Média entre dois Valores digitados");
		
		System.out.println("Digite o n°1: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o n°2: ");
		n2 = sc.nextInt();
		
		System.out.println("A média é: " + ((n1 + n2)/2));
	}

}
