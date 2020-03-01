package com.company;

public class Parrot extends Animal implements Printable{
    private String  color;


    @Override
    public void printInfo() {
        System.out.println("white");
    }

    public Parrot(String color){
        this.color=color;
    }
    }
