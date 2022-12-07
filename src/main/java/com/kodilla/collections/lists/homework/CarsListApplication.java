package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(30);
        cars.add(new Bmw(50));
        cars.add(new Mazda(100));
        cars.add(opel);

        cars.remove(0);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}