package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import banco.Cliente;;

public class BancoTest {
	
	private String CreateNameClient() {
		Cliente cliente = new Cliente();
		cliente.setNome("Eduardo");
		String nome = cliente.getNome();
		return nome;
	}
	
	@Test
	public void RetornaClienteCorreto() {
		
		String nome = CreateNameClient();
		
		Assert.assertEquals("Eduardo", nome);
	}

	@Test
	public void RetornaClienteErrado() {
		String nome = CreateNameClient();
		
		Assert.assertNotEquals("Julia", nome);
	}

}
