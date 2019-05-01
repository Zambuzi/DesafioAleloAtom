package Filmes;

public class Diretor {
	private String nome;
	private String dataNascimento;
	
	public Diretor(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	
}
