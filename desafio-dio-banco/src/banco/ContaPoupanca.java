package banco;
public class ContaPoupanca  extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirextato() {
		System.out.println("*** Extarto Conta Poupança ***");
		super.imprimirAtributosComuns();
	}

	
}
