#language: pt
Funcionalidade: Teste Alelo Selenium

 	@testeSelenium
  Cenario: Busco Filmes e diretor
    Dado Cadastro diretores e filmes
      | nomeDiretor   | data_nascimento | nomeFilme           | anoLancamento |
      | Anthony Russo | 03/02/1971      | Vingadores Ultimato |          2019 |
      | Steven Spielberg | 16/08/1954   | Jogador Numero 1    |          2011 |
      | Tim Miller    | 10/10/1964      | DeadPool            |          2016 |
    Quando realizo a busca dos filmes e diretores
    Entao exibo o resultado da quantidade de resultados
    
