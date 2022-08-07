
public class Main {

	public static void main(String[] args) {
		Cliente ALINE = new Cliente();
		ALINE.setNome("ALINE");
		
		Conta cc = new ContaCorrente(ALINE);
		Conta poupanca = new ContaPoupanca(ALINE);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}