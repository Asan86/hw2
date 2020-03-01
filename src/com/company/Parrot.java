package com.company;

public class Parrot extends Animal implements Printable {
    String  color;
    String eyes;

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    @Override
    public void printInfo() {
        System.out.println("white");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Parrot(int age, String color, String color1, String eyes) {
        super(age, color);
        this.color = color1;
        this.eyes = eyes;
    }
}
