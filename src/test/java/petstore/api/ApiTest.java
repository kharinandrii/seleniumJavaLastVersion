package petstore.api;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
//import org.testng.annotations.Test;


import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApiTest {

    @Test
    @Order(3)
    public void testGet() {
                when()
                .get("https://petstore.swagger.io/v2/pet/6")
                        .then()
                        .statusCode(200)
                .assertThat().body("name", equalTo("testOne"));
        Response response = get("https://petstore.swagger.io/v2/pet/1");


    }

    @Test
    @Order(1)
    public void  addAnimal() {
        given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": 6,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"testOne\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/pet")
        .then().statusCode(200);
        Response response = get("https://petstore.swagger.io/v2/pet");

    }

    @Test
    @Order(2)
    public void changeAnimalName() {
        given().contentType("application/json")
                .body("{\n" +
                        "  \"id\": 6,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}").when()
                .put("https://petstore.swagger.io/v2/pet")
                .then().statusCode(200);
    }

    @Test
    public void checkJsonSchemaValidation() {
        get("https://petstore.swagger.io/v2/pet/6").then().
                assertThat().body(matchesJsonSchemaInClasspath("postSchema.json"));
    }

    @Test
    public void checkValidationJsonWithDraftVersion() {
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory
                .newBuilder().setValidationConfiguration(
                        ValidationConfiguration.newBuilder()
                                .setDefaultVersion(SchemaVersion.DRAFTV4).freeze()).freeze();

         get("https://petstore.swagger.io/v2/pet/6").then()
                 .assertThat()
                 .body(matchesJsonSchemaInClasspath("postSchema.json").using(
                         jsonSchemaFactory));
    }
}
