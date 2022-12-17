package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

//    public Boat()
//    {
//        this.name = getVehicleName();
//        this.capacity = getVehicleCapacity();
//    }


    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
