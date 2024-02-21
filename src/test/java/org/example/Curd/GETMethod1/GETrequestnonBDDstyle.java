package org.example.Curd.GETMethod1;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GETrequestnonBDDstyle {
    public static void main(String[] args) {
        // https://restful-booker.herokuapp.com/booking/

        RequestSpecification r= RestAssured .given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("booking/2447").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);

    }
}
