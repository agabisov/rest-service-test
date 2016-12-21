package com.example;

import com.example.cars.Models.Cars;
import com.example.personalCar.Models.PersonalCar;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasSize;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import com.example.ExtraClass;

/**
 * Created by agab on 12/19/2016.
 */
public class GetRequest {
    String carsId = "1";
    @BeforeClass
    public void beforeClass() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
        RestAssured.basePath = "/Cars";
    }

    @Test
    public void getRequestFuncList() {
        List<Cars> cars = Arrays.asList(

                when()
                        .get()
                        .then()
                        .extract().body().as(Cars[].class));
        assertThat(cars.size(), equalTo(10));
        assertThat(cars.get(1).getSpeed(), equalTo(150));
    }
    @Test
    public void getRequestFewChecks() {
        List<Cars> cars = Arrays.asList(
                when()
                        .get()
                        .then()
                        .extract().body().as(Cars[].class));
        assertThat(cars , notNullValue());
        assertThat(cars, hasSize(10));
        assertThat(Cars[].class , typeCompatibleWith(Object[].class));
    }
    @Test
    public void getFuncEqualTo() {
        Cars cars = new Cars();
        when()
                .get(carsId)
                .then().
        assertThat().statusCode(200).body("id",equalTo(1));
    }
    @Test
    public void getFuncHasKey() {
        Cars cars = new Cars();
        when()
                .get("1")
                .then().
                assertThat().body("",hasKey("power"));
    }
    @Test
    public void getFuncTimeUnit() {
        Cars cars = new Cars();
        when()
                .get(carsId)
                .then().
                assertThat().time(lessThan(900L),TimeUnit.MILLISECONDS);
    }
    @Test
    public void getFuncFilter() {
        Cars cars = new Cars();
        when()
                .get("?id=1&id=2")
                .then().
                assertThat().body("power",hasItems(50,100)).statusCode(200);
    }
    @Test
    public void getFuncParam() {
        Cars cars = new Cars();
        when()
                .get("?_start=2&_end=4")//cars which has id 2 and 4
                .then().
                assertThat().statusCode(200).body("power",hasItems(150,300));
    }

}