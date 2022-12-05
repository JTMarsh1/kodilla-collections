package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("                            ");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Bmw)
            return "Bmw";
        else if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown name of Car";
    }
}