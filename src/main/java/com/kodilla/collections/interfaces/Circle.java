package com.kodilla.collections.interfaces;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private double widthh;

    public Circle(double widthh){
        this.widthh = widthh;
    }

    public double getArea(){
        return PI*widthh*widthh;
    }
    public double getPerimeter(){
        return 2*PI*widthh;
    }

}
