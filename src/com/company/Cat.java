package com.company;

public class Cat extends Animal implements Printable{
int vote;
    @Override
    public void printInfo() {
        System.out.println("mya-mya");
    }

    public Cat(int vote) {
        this.vote = vote;
    }
}
