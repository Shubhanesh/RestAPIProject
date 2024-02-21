package org.example.Curd;

import io.restassured.RestAssured;

public class RATTestcase1 {
    public static void main(String[] args) {

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us").basePath("/IN/560037")
                .when()
                .get()
                .then().log().all().statusCode(201);



    }
}
