package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private double speed;

    public Opel(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        System.out.println("Opel has speed");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;
    }
}

