package com.jaakkomantyla.rest.restserver;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location {


    @Id
    @GeneratedValue
    private int id;
    private double latitude;
    private double longitude;

    public Location(){}

    public Location( double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }



    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
