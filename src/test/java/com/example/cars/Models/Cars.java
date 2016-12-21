package com.example.cars.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by agab on 12/19/2016.
 */
public class Cars {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("speed")
    @Expose
    private Integer speed;
    @SerializedName("power")
    @Expose
    private Integer power;
    @SerializedName("colour")
    @Expose
    private Colour colour;
    @SerializedName("cost")
    @Expose
    private Integer cost;
    @SerializedName("model")
    @Expose
    private String model;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

