package banco;
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirextato() {
		System.out.println("*** Extarto Conta Corrente ***");
		super.imprimirAtributosComuns();
	}		
}
