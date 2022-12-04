package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {
    private double speed;

    public Bmw(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        System.out.println("Bmw has speed ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 21;
    }
}
