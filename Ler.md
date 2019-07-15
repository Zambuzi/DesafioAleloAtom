# testeAlelo
automacao de testes selenium e api

Para execução do teste utilizando selenium usar a linha de comando abaixo:
mvn test -Dtest=RunnerTest -Dcucumber.options="--tags @testeSelenium"

Para execução do teste utilizando jayway usar a linha de comando abaixo:
mvn test -Dtest=RunnerTest -Dcucumber.options="--tags @testeApi"
