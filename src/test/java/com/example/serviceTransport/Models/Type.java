package com.example.serviceTransport.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by agab on 12/19/2016.
 */
public class Type {
    @SerializedName("military")
    @Expose
    private String military;
    @SerializedName("ambulance")
    @Expose
    private String ambulance;

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public String getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(String ambulance) {
        this.ambulance = ambulance;
    }
}
