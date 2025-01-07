package org.example;

public class Car {

    String color;
    String make;
    String price;
    int year;
    Boolean isMechanic;


    public Car(){

    }

    public Car(String color, String make, String price, int year, Boolean isMechanic) {
        this.color = color;
        this.make = make;
        this.price = price;
        this.year = year;
        this.isMechanic = isMechanic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return make;
    }

    public void setModel(String model) {
        this.make = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean getMechanic() {
        return isMechanic;
    }

    public void setMechanic(Boolean mechanic) {
        isMechanic = mechanic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + make + '\'' +
                ", price='" + price + '\'' +
                ", year=" + year +
                ", isMechanic=" + isMechanic +
                '}';
    }
}
