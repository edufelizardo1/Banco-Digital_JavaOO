package banco;

public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.setCliente(cliente);
	}
	
	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Não é possível efetuar o saque.");
		}
	}
	@Override
	public void despositar(double valor) {
		this.saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (saldo >= valor) {
			this.sacar(valor);
			contaDestino.despositar(valor);
		} else {
			System.out.println("Não é possível fazer a transferência.");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	protected void imprimirAtributosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}	
}
