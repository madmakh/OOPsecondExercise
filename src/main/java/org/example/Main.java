package org.example;

public class Main {
    public static void main(String[] args) {

        //////////////////////////////
        Car car = new Car();
        car.setModel("Toyota");
        car.setColor("black");
        car.setPrice("$20.000");
        car.setYear(2022);
        car.setMechanic(false);
        System.out.println(car.toString());

        //////////////////////////////

        Triangle triangle = new Triangle();
        triangle.perimeter(3, 5.4, 6);
        triangle.area(5, 6);

        ////////////////////////////

        Point point = new Point(4.0, 5.0, 6.0);
        System.out.println(point.display());










    }
}