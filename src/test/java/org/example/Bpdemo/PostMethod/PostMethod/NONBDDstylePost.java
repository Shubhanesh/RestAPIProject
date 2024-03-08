package org.example.Bpdemo.PostMethod.PostMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class NONBDDstylePost {
    @Test
    public void testNonBDDStylePOSTPositive(){

        RequestSpecification r= RestAssured.given();

        String payload = "{\n" +
                "        \"username\": \"admin\",\n" +
                "        \"password\": \"password123\"\n" +
                "}";

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        Response response = r.when().post();

       // Valiodation

        ValidatableResponse validatableResponse =  response.then();
        String responseString = response.asString();
        System.out.println(responseString);

        validatableResponse.statusCode(200);

    }
}
