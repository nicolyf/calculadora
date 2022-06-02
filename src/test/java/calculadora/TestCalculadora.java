package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {
	private Calculadora calculadora;

	@Before
	public void inicializacao() {
		calculadora = new Calculadora(4.0, 2.0);
	}

	@Test
	public void testGetAdicao() {
		double retornoEsperado = 5.0;
		double retornoFeito = calculadora.getAdicao();
		assertEquals(retornoEsperado, retornoFeito, 2);
	}

	@Test
	public void testGetSubtracao() {
		double retornoEsperado = 3.0;
		double retornoFeito = calculadora.getSubtracao();
	}

	@Test
	public void testGetProduto() {
		double retornoEsperado = 8.0;
		double retornoFeito = calculadora.getProduto();
	}

	@Test
	public void testGetDivisao(){
	double retornoEsperado = 2.0;
	double retornoFeito = calculadora.getDivisao();
	}
}
