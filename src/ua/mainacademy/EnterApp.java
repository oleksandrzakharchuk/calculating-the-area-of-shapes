package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Square;
import ua.mainacademy.model.Triangle;

public class EnterApp {

    public static void main(String[] args) {

        Triangle triangle=new Triangle();
        triangle.setA(4);
        triangle.setH(6);
        System.out.println("Triangle area is " + triangle.getArea());

        Circle circle=new Circle();
        circle.setRadius(4);
        System.out.println("Circle area  is " +circle.getArea());

        Square square=new Square();
        square.setSideA(4);
        System.out.println("Square area is " + square.getArea());
    }
}

