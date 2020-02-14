package br.com.caelum.leilao.teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.response.Response;

import br.com.caelum.leilao.modelo.Usuario;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class deveRetornarListaDeUsuarios {

	@Test
	public void deveRetornarListaDeUsuarios() {
		XmlPath path = given()
                .header("Accept", "application/xml")
                .get("/usuarios")
                .andReturn().xmlPath();
		List<Usuario> usuarios = path.getList("list.usuario", Usuario.class);
        Usuario esperado1 = new Usuario(1L, "Mauricio Aniche", "mauricio.aniche@caelum.com.br");
        Usuario esperado2 = new Usuario(2L, "Guilherme Silveira", "guilherme.silveira@caelum.com.br");

        assertEquals(esperado1, usuarios.get(0));
        assertEquals(esperado2, usuarios.get(0));

    }
	@Test
    public void deveRetornarUsuarioPeloId() {
        JsonPath path = given()
                .parameter("usuario.id", 1)
                .header("Accept", "application/json")
                .get("/usuarios/show")
                .andReturn().jsonPath();

        Usuario usuario = path.getObject("usuario", Usuario.class);
        Usuario esperado1 = new Usuario(1L, "Mauricio Aniche", "mauricio.aniche@caelum.com.br");

        assertEquals(esperado1, usuario);

    }
	/*
	 * exemplo de body com .and
	@Test
    public void givenData() {
        RestAssured.baseURI = "https://maps.googleapis.com";

                Response returnGivenData = given().
                param("location", "-33.8670522,151.195736").
                param("radius", "500").
                param("key", "AIzaSyBde6fW-IAx1j-J5TqNOwmvx-_QPHozqRY").
                when().
                get("/maps/api/place/nearbysearch/json").
                then().assertThat().statusCode(200).and().
                contentType(ContentType.JSON).and().
                body("results[0].name", equalTo("Sydney")).and().
                body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
                header("Server", "pablo").
                extract().
                response();
        JsonPath responseJson = ReusableMethods.convertRawDataToJson(returnGivenData);

    int count=responseJson.get("results.size()");     //ERROR LINE
    System.out.println(count);  
}}
*/
}
