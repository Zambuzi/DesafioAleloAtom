package steps;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import Filmes.Diretor;
import Filmes.Filmes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;
import pages.BuscaDiretorFilme;

public class BuscaDiretorFilmeSteps {
	private Filmes filmes = new Filmes();
	private BuscaDiretorFilme buscaDiretorFilme = new BuscaDiretorFilme();
	private List<String> listBusca = new ArrayList<String>();
	
	@Dado("Cadastro diretores e filmes")
	public void cadastroDiretoresEFilmes(DataTable dataTable) {
	    buscaDiretorFilme.abreNavegador("https://www.google.com.br");
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	    for( Map<String, String> filme : list )
	    {
	    	filmes.addDiretor(filme.get("nomeDiretor"), filme.get("data_nascimento"));
	    	filmes.addFilme(filme.get("nomeFilme"), filme.get("anoLancamento"));
	    }
	}

	@Quando("realizo a busca dos filmes e diretores")
	public void realizoABuscaDosFilmesEDiretores() throws Exception{
	    
	    String pesquisa;
	    String resultado;
	    int i = 0;
	    for (Diretor diretor : filmes.getDiretor()) {
	    	pesquisa = diretor.getNome()+" "+filmes.getFilme().get(i).getNome();
	    	buscaDiretorFilme.digitaBusca(pesquisa);
			buscaDiretorFilme.clickPesquisaGoogle();
			resultado = buscaDiretorFilme.getResultadoBusca();
			listBusca.add(pesquisa+": "+resultado);
			i++;
		}
	    
	}

	@Então("exibo o resultado da quantidade de resultados")
	public void exiboOResultadoDaQuantidadeDeResultados() {
	    // Write code here that turns the phrase above into concrete actions
	    for (String resultado : listBusca) {
			System.out.println(resultado);
		}
	}
}
