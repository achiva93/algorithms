package com.lseg.teme.Homework7;

public class Car extends Vehicle {
    private String colour;
    private String transmissionType;
    private String bodyType;

    public Car(String colour, String transmissionType, String bodyType) {
        this.colour = colour;
        this.transmissionType = transmissionType;
        this.bodyType = bodyType;
    }

    public void steer(String direction, double angle) {
        System.out.println("Steering " + angle + " direction " + direction);
    }

    public void changeGear(int gear) {
        System.out.println("The current gear is " + gear);

    }

    public void move(int kmPerHour) {
        System.out.println("The current speed is " + kmPerHour);
    }

    public String getColour() {
        return colour;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getBodyType() {
        return bodyType;
    }
}

