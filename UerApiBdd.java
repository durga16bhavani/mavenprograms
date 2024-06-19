package RestAssuredPrograms;


import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class UerApiBdd {
	@Before
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	}
	@Test
	public void testGetUserById() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given()
		  .header("Accept","application/xml")
		.when()
		  .get("users/1")
		.then()
		   .statusCode(200)
		   .body("id",equalTo(1))
		   .body("username", not(empty()))
		   .body("email", containsString("@"))
		   .log().all();	   
	}
	@Test
	public void testCreateUser() {
	//	RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		String newUser= "{\"name\":\"Laya\",\"username\":\"Laya\",\"email\":\"laya@gmail.com\"}";
		
		given()
		  .contentType("application/json")
		  .body(newUser)
		.when()
		  .post("/users")
		.then()
		   .statusCode(201)
		   .body("name",equalTo("Laya"))
		   .body("username",equalTo("Laya"))
		   .body("email",equalTo("laya@gmail.com"))
		   .log().all();	   
	}
	@Test
	public void testResponseBody() {
		//RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given()
		.when()
		   .get("posts/1")
		 .then()
		   .statusCode(200)
		   .body("userId",equalTo(1))
		   .body("id",equalTo(1))
		   .body("title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
		   .body("body",not(empty()));
	}

}
