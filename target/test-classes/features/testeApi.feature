#language: pt
Funcionalidade: Teste Alelo API
	@testeApi
  Esquema do Cenario: Validacao dados com sucesso
    Dado que acesso a api "https://jsonplaceholder.typicode.com/todos/" com id "<id>"
    Entao valido o titulo "<title>"

    Exemplos: 
      | id  | title                                                           |
      |   1 | delectus aut autem                                              |
      |  10 | illo est ratione doloremque quia maiores aut                    |
      |   5 | laboriosam mollitia et enim quasi adipisci quia provident illum |
      | abc | null                                                            |
