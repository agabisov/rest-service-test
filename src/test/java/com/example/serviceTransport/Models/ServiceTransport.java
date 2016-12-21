package com.example.serviceTransport.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by agab on 12/19/2016.
 */
public class ServiceTransport {
    @SerializedName("carsId")
    @Expose
    private Integer carsId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private Type type;

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
