package com.example.truck.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by agab on 12/19/2016.
 */
public class Truck {
    @SerializedName("carsId")
    @Expose
    private Integer carsId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;

    public Integer getCarsId() {
        return carsId;
    }

    public void setCarsId(Integer carsId) {
        this.carsId = carsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
