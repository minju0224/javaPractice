package com.hanwhaswcamp.chap08.level01.basic;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(int i, int i1) {
        super();
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return 2*(width+height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }


}
