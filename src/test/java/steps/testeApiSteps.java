package steps;


import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class testeApiSteps {
	JsonPath path;
	@Dado("que acesso a api \"([^\"]*)\" com id \"([^\"]*)\"$")
	public void queAcessoAApiComId(String title, String id) {
		path = given()
               
                .header("Accept", "application/json")
                .get("https://jsonplaceholder.typicode.com/todos/"+id)
                .andReturn().jsonPath();
		
		
	}

	@Entao("valido o titulo \"([^\"]*)\"$")
	public void retornaOTile(String title) {
	    if (title.equals("null")) {
			title = null;
		}
	    assertEquals(title, path.getString("title"));
	}
}
