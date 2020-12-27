package ua.mainacademy.model;

public class Triangle implements Shape {
    private double a;
    private double h;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public  double getArea() {
        return (a*h)/2;
    }
}
