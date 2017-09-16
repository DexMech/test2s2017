package br.com.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.fatec.modelo.Empresa;

public class UC02ConsultarEmpresa {
	public static  Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("oi");
	}

	/**
	 * CT01UC02ConsultarEmpresa
	 * obj - consulta empresa cadastrada
	 */
	@Test
	public void CT01UC02ConsultarEmpresa() {
		assertEquals("oi", empresa.getNomeDaEmpresa());
	}
	
	

}
