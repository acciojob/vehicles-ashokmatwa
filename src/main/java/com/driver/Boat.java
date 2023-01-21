package com.driver;

public class Boat implements WaterVehicle {

//    Has the following member variables: a. name : of String type       b. capacity : of int type

    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //    Return name and capacity in getVehicleName and getVehicleCapacity respectively.
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
