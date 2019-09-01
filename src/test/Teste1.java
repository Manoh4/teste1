package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Teste1 {
	
	@Test
	public void teste1() {
			int i = 0;
			assertTrue("Erro 1", i==1);
	}

	@Test
	public void teste2() {
			int i = 0;
			assertTrue("Erro 2 ", i==1);
	}

	@Test
	public void teste3() {
			int i = 0;
			assertTrue("Erro 3", i==0);
	}

	@Test
	public void teste4() {
			int i = 0;
			assertTrue("Erro 4", i==1);
	}

}
