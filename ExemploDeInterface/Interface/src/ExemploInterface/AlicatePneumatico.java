package ExemploInterface;

import javax.swing.JOptionPane;

public class AlicatePneumatico implements FerramenteCorte, FerramentaPneumatica {
	public double getCapacidadeDeCorte() {
		return 2.5;
	}
	
	public double getPressaoAr() {
		return 15;
	}
	
	public void mostraCapacidadePressao() {
		JOptionPane.showMessageDialog(null, "A Capacidade de corte: " + getCapacidadeDeCorte() +
		"\n\n" + "A Capacidade de Pressão: " + + getPressaoAr());
	}
	
}
