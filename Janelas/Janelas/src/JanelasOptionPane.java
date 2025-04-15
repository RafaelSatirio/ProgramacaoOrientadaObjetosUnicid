import javax.swing.JOptionPane;

public class JanelasOptionPane {

	public static void main(String[] args) {
		int x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		System.out.println("O valor de x é: " + x);

	}

}
