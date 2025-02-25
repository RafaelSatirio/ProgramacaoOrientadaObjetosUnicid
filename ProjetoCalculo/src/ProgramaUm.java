import java.util.Scanner;

public class ProgramaUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa Exemplo");
		float n1, n2, resultado = 0;
		
		System.out.println("Digite o valor do primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o valor do segundo número: ");
		n2 = sc.nextInt();
		System.out.println("O valor do primeiro número é: " + n1);
		System.out.println("O valor do segundo número é: " + n2);
		resultado = (n1 + n2) / 2;
		System.out.println("A média é: " + resultado);
	}

}
