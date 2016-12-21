package com.example.publicTransport.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by agab on 12/19/2016.
 */
public class PublicTransport {
    @SerializedName("carsId")
    @Expose
    private Integer carsId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("seets")
    @Expose
    private Integer seets;

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

    public Integer getSeets() {
        return seets;
    }

    public void setSeets(Integer seets) {
        this.seets = seets;
    }

}
