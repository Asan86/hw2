package com.company;

public  class Dog extends Animal implements Printable {
    String  breed;

    public String getBreed() {
        return breed;
    }


    public Dog(int age, String color, String breed) {
        super(age, color);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void printInfo() {
        System.out.println("gav-gav");
    }


}
