package testeexemploclasses;

public class ContaPoupanca extends Conta{
	String dataAniversario;
	
	void saqueConta(double valor) {
		if((saldo-valor) < 0) {
			System.out.println("ERRO:saldo ficara abaixo de R$ 0.00");
		}else saldo = saldo - valor;
	}
	
}
