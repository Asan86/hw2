package com.company;

public  class Dog extends Animal implements Printable {
    private   String  age;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void printInfo() {
        System.out.println("gav-gav");
    }

    public Dog(String age) {
        this.age = age;
    }
}

