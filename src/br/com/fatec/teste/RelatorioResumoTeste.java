package br.com.fatec.teste;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RelatorioResumoTeste {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(RoteiroDeTestes.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("total de testes executados =>" + result.getRunCount());
		System.out.println("total de erros =>" + result.getFailureCount());
	}

}
