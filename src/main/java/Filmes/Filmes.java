package Filmes;

import java.util.ArrayList;
import java.util.List;

public class Filmes {
	private List<Diretor> diretor;
	private List<Filme> filme;
				
	public Filmes() {
		diretor = new ArrayList<Diretor>();
		filme = new ArrayList<Filme>();
	}
	
	public void addDiretor(String nome, String dataNascimento) {
		diretor.add(new Diretor(nome, dataNascimento));
	}
	
	public void addFilme(String nome, String anoLancamento) {
		filme.add(new Filme(nome, anoLancamento));
	}
	
	public List<Diretor> getDiretor(){
		return diretor;
	}
	
	public List<Filme> getFilme(){
		return filme;
	}
		
	
}
