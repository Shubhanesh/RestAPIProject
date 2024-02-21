package org.example.Bpdemo.DeleteMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDDeleteMethod {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "410e883af8199c8";
@Test
    public void testDELETEREQUEST(){
    requestSpecification = RestAssured.given();
    requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
    requestSpecification.basePath("booking/1901");
    requestSpecification.contentType(ContentType.JSON);
    requestSpecification.cookie("token",token);


    Response response = requestSpecification.when().delete();

    // Get Validatable response to perform validation
    validatableResponse = response.then().log().all();

    validatableResponse.statusCode(201);
//        validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
//        validatableResponse.body("lastname", Matchers.equalTo("Brown"));
    }
}
