package com.example;

import com.example.cars.Models.Cars;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by agab on 12/19/2016.
 */
public class DeleteRequest {
    @BeforeClass
    public void beforeClass(){
        String carsId = "11";
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
        RestAssured.basePath = "/Cars/" + carsId;
    }
    @Test
    public void deleteRequestFunc(){
        Cars cars = new Cars();
        given().
                contentType("application/json; charset=UTF-16").
                body(cars).
                when().
                delete().then().assertThat().statusCode(200);
    }
}
