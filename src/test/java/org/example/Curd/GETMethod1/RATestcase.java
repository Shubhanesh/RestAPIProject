package org.example.Curd.GETMethod1;

import io.restassured.RestAssured;

// GET Request - https://api.zippopotam.us/IN/560037
// URL
// HEADER ?
// GET Method
// base url = https://api.zippopotam.us
// basePath = /IN/560037
// PaYLOAD - ? NO
// Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No

// Status Code
// Response Body
// Time, Headers ,Cookies

// Gherkin -> Given, When, then -> Style ->
// BDD - Framework differnt
// Synctax - Gherkin Sytax - (given, when, then)
// Non BDD and still Gherkin syntax

//        pm.test("TestCase Name", function(){
//
//        }) -> DSL belongs Postman Testcase

// RestAssured.given().when().then() - DSL (Java)


// given ->
// URL
// HEADER ?, Cookies
// base url = https://api.zippopotam.us
// basePath = /IN/560037
// Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No


// When  ->
// PaYLOAD - ? NO/yES
// GET Method



// Then()
// Response
// Validation
//  Status Code
//  Response Body
//  Time, Headers ,Cookies

public class RATestcase {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us").basePath("/IN/560037")

                .when()
                .get()

                .then().statusCode(200);
    }
}
