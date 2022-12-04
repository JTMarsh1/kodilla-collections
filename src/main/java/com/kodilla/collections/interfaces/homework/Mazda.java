package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {
    private double speed;

    public Mazda(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        System.out.println("Mazda has speed");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 60;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 34;
    }
}