package com.example;

import com.example.cars.Models.Cars;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.example.ExtraClass;

import static io.restassured.RestAssured.given;

/**
 * Created by agab on 12/19/2016.
 */
public class PutRequest {
    @BeforeClass
    public void beforeClass(){
        String carsId = "7";
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
        RestAssured.basePath = "/Cars/" + carsId;
    }
    @Test
    public void putRequestFunc(){
        ExtraClass extraClass = new ExtraClass();
        Cars cars = new Cars();
        cars = extraClass.setCarsVal();
        given().
                contentType("application/json; charset=UTF-16").
                body(cars).
                when().
                put().then().assertThat().statusCode(200);
    }
}
