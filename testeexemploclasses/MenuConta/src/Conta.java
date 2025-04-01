
public class Conta {
	int numeroConta;
	int numeroCliente;
	double saldo;
	String dataAbertura;
	
	void saqueConta(double valor){
		saldo = saldo - valor;
	}
	
	void depositaConta(double valor){
		saldo = saldo - valor;
	}
	
	Conta(){
		saldo = 100.00;
		dataAbertura="";
	}
}
