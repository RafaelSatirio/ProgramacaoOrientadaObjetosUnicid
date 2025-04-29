package pacote1;
import javax.swing.JOptionPane;

public class TestaStatic {
	static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	static double media = 0;
	public static void mediaC(double n1, double n2, double n3, double n4) {
		media = (n1 + n2 + n3 + n4) / 4;
	}
	public void multiplicarC() {
		
	}
	public static void main(String[] args) {
		
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int resultado;
		
		resultado = n1 + n2 + n3 + n4;
		System.out.println("A soma dos números que digitou é: " + resultado);


	}

}
