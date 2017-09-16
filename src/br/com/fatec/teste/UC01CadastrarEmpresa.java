package br.com.fatec.teste;

import static org.junit.Assert.*;

import java.nio.channels.NonReadableChannelException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.fatec.modelo.Empresa;

public class UC01CadastrarEmpresa {
	public static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		empresa = new Empresa();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	/**
	 * CT01UC01CadastrarEmpresa
	 * obj - verificar se a validação da empresa com nome vazio, funciona
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT01UC01CadastrarEmpresa() {
		empresa.setNomeDaEmpresa("");
	}
	/**
	 * CT02UC01CadastrarEmpresa 
	 * obj - verificar se a validação da empresa com nome vazio, funciona
	 */
	@Test
	public void CT02UC01CadastrarEmpresa(){
		try{
			empresa.setNomeDaEmpresa("");
		}catch(Exception e){
			assertEquals("Nome da empresa invalido", e.getMessage());
		}
		
	}
	


}
