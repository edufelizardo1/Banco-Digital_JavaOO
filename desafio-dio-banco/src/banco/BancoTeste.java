package banco;

public class BancoTeste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Eduardo");
		
		Conta contaCorrente = new ContaCorrente(cliente);
		contaCorrente.despositar(50000000.00);
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		
		
		contaCorrente.transferir(10000.00, contaPoupanca);
		
		contaCorrente.imprimirextato();
		contaPoupanca.imprimirextato();
	}
}