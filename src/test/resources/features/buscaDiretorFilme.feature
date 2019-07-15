#language: pt
Funcionalidade: Teste Alelo Selenium

 	@testeSelenium
  Cenario: Busco Filmes e diretor
    Dado Cadastro diretores e filmes
      | nomeDiretor    | data_nascimento | nomeFilme           | anoLancamento |
      | James McTeigue | 29/12/1967      | V de Vinganca       |          2005 |
      | David Fincher  | 28/08/1962      | Clube da luta       |          1999 |
      | Kevin Reynolds | 17/01/1952      | O Conde de Monte Cristo |          2002 |
    Quando realizo a busca dos filmes e diretores
    Entao exibo o resultado da quantidade de resultados
