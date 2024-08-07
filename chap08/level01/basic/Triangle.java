package com.hanwhaswcamp.chap08.level01.basic;

public class Triangle extends Shape implements Resizable{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double base, double height, double side1, double side2, double side3) {}

    @Override
    public double calculateArea(){
        return base*height/2;
    }

    @Override
    public double calculatePerimeter(){
        return side1+side2+side3;
    }
    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
