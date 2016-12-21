package com.example.cars.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by agab on 12/19/2016.
 */
public class Colour {
    @SerializedName("colour1")
    @Expose
    private String colour1;
    @SerializedName("colour2")
    @Expose
    private String colour2;
    @SerializedName("colour3")
    @Expose
    private String colour3;

    public String getColour1() {
        return colour1;
    }

    public void setColour1(String colour1) {
        this.colour1 = colour1;
    }

    public String getColour2() {
        return colour2;
    }

    public void setColour2(String colour2) {
        this.colour2 = colour2;
    }

    public String getColour3() {
        return colour3;
    }

    public void setColour3(String colour3) {
        this.colour3 = colour3;
    }
}
