package com.example;

import com.example.cars.Models.Cars;
import com.example.cars.Models.Colour;

/**
 * Created by agab on 12/19/2016.
 */
public class ExtraClass {
    public Cars setCarsVal()
    {
        Cars cars = new Cars();
        Colour colour = new Colour();
        cars.setId(12);
        cars.setModel("Honda");
        cars.setSpeed(201);
        cars.setPower(150);
        cars.setCost(50000);

        colour.setColour1("Blue");
        colour.setColour2("Yellow");
        colour.setColour3("Green");

        cars.setColour(colour);
        return cars;
    }

}
