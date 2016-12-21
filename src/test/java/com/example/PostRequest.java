package com.example;

import com.example.cars.Models.Cars;
import com.example.cars.Models.Colour;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.*;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.given;

/**
 * Created by agab on 12/19/2016.
 */
public class PostRequest {
    @BeforeClass
    public void beforeClass(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
        RestAssured.basePath = "/Cars";
    }
    @Test
    public void postRequestFunc(){
        ExtraClass extraClass = new ExtraClass();
        Cars cars = new Cars();
        cars = extraClass.setCarsVal();
        given().
                contentType("application/json; charset=UTF-16").
                body(cars).
                when().
                post().then().assertThat().statusCode(201);
    }

}
