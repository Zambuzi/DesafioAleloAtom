package pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import support.DriverQA;

//private String 


public class BuscaDiretorFilme {
	private String inputBusca = "q";
	private String buttonPesquisa = "btnK";
	private String resultadoPesquisa = "resultStats";
	public void abreNavegador(String endereco) {
		DriverQA.start(endereco);
	}
	
	public void digitaBusca(String busca) {
		DriverQA.waitElement(inputBusca, "name");
		DriverQA.sendKeys(busca, inputBusca, "name");
	}
	
	public void clickPesquisaGoogle() throws Exception {
		try {
			DriverQA.teclaEnter();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			throw new Exception("Nao foi possivel executar o comando");
			
		}
		
	}
	
	public String getResultadoBusca() {
		return DriverQA.getText(resultadoPesquisa, "id");
	}
}
