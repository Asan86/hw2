package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Cat");
        createObject("Dog");
        createObject("Parrot");


        Dog dog=new Dog(1,"white", "ovcharka");

    }

    public static Printable createObject(String className) {
        Printable printable;
        switch (className) {
            case "Cat":
                printable = new Cat(1, "black", "mm", 22.0 );
                printable.printInfo();
                break;
            case "Dog":
                printable=new Dog(1,"white", "ovcharka");
                printable.printInfo();
            case "Parrot":
                printable=new Parrot(2, "Whit", "Blue", "round");
                printable.printInfo();
            default:
                throw new IllegalStateException("Unexpected value: " + className);
        }
        return printable;
    }
}
