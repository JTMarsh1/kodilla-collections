package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(200);
        doRace(bmw);

        Opel opel = new Opel(150);
        doRace(opel);

        Mazda mazda = new Mazda(135);
        doRace(mazda);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}