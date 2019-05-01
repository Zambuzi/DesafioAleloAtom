package Filmes;

public class Filme {
	private String nome;
	private String anoLancamento;
	
	public Filme(String nome, String anoLancamento) {
		this.nome = nome;
		this.anoLancamento = anoLancamento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAnoLancamento() {
		return this.anoLancamento;
	}
}
