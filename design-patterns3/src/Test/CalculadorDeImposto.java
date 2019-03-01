package Test;

import static org.junit.Assert.*;
import br.Alura.ICMS;
import br.Alura.ISS;
import br.Alura.Imposto;
import br.Alura.Orcamento;

import org.junit.Test;

public class CalculadorDeImposto {

	@Test
	public void deveraRetornarImpostoCalculadoICMS() {
        Imposto	icms = new ICMS();
        Orcamento orcamento = new Orcamento(500.00);
        double delta = 0.01;
	  assertEquals(75.00,icms.calculaOrcamento(orcamento),delta);
	
	}

	@Test
	public void deveraRetornarImpostoCalculadoISS() {
        Imposto	iss = new ISS();
        Orcamento orcamento = new Orcamento(500.00);
        double delta = 0.01;
	  assertEquals(30.00,iss.calculaOrcamento(orcamento),delta);
	
	}
}
