package testeexemploclasses;

public class testexemploclasses {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		System.out.println("O Saldo da conta corrente é: " + cc.saldo);
		System.out.println("O número da conta corrente é: " + cc.numeroConta);
		cc.dataAbertura="17/03/2025";
		System.out.println("A data de abertura da conta corrente é: " + cc.dataAbertura);
		cc.saqueConta(300);
		System.out.println("O novo saldo da conta corrente é: " + cc.saldo);
		
		ContaPoupanca cp = new ContaPoupanca();
		System.out.println("O saldo da conta poupança é: " + cp.saldo);
		cp.saqueConta(300);
		System.out.println("O novo saldo da conta poupança é: " + cp.saldo);
		
		Conta c = new Conta();
		System.out.println("O saldo da conta é: " + c.saldo);

	}

}
