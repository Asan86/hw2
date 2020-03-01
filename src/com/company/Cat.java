package com.company;

public class Cat extends Animal implements Printable {
    String vote;
    double height;

    @Override
    public void printInfo() {
        System.out.println("mya-mya");
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cat(int age, String color, String vote, double height) {
        super(age, color);
        this.vote = vote;
        this.height = height;
    }


    }

