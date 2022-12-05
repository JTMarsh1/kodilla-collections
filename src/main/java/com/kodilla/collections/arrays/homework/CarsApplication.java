package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Bmw;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[12];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(4);
        double speed = getRandomSpeed(random);
        if (drawnCar == 0)
            return new Mazda(speed);
        else if (drawnCar == 1)
            return new Bmw(speed);
        else {
            double b = getRandomSpeed(random);
            return new Opel(speed);
        }
    }

    private static double getRandomSpeed(Random random) {
        return RANDOM.nextDouble() * 200 + 1;

    }
}