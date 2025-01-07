package org.example;

public class Triangle {
    int side1;
    int side2;
    int side3;

    public Triangle(){

    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public void perimeter(int a, double b, int c){
        double result;
        result = (a + b +c);
        System.out.println("The perimeter of triange is: " + result);


    }

    public void area(double height, double base){
        double result;
        result = (1.0 / 2) * height * base;
        System.out.println("The area of the triangle is: " + result);
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
