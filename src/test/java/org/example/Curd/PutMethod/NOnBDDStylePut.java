package org.example.Curd.PutMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class NOnBDDStylePut {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "d80878906800006";

@Test
    public void testputRequest(){

        // url
        // auth - token , da829f2541bfd38 , headers - json
        // id - 3548
        // payload

        String payload = "{\n" +
                "    \"firstname\" : \"Anju\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

    requestSpecification = RestAssured.given();
    requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
    requestSpecification.basePath("booking/3327");
    requestSpecification.contentType(ContentType.JSON);
    requestSpecification.cookie("token",token);

    //requestSpecification.body(payloadPATCH).log().all();

    Response response = requestSpecification.when().patch();

    // Get Validatable response to perform validation
    validatableResponse = response.then().log().all();

    validatableResponse.statusCode(200);
    validatableResponse.body("firstname", Matchers.equalTo("Anju"));
    validatableResponse.body("lastname", Matchers.equalTo("Brown"));




}
}
