
public class ContaPoupanca extends Conta{
	String dataAniversario;
	
	void saqueConta(double valor){
		if((saldo - valor) < 0) {
			System.out.println("ERRO: saldo ficará abaixo de R$ 0.00");
		}else saldo = saldo - valor;
	}
	
}
