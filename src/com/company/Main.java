package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Cat");
        createObject("Dog");
        createObject("Parrot");

    }

    public static Printable createObject(String className) {
        Printable printable;
        switch (className) {
            case "Cat":
                printable = new Cat(12);
                printable.printInfo();
                break;
            case "Dog":
                printable=new Dog("haskdhsa");
                printable.printInfo();
            case "Parrot":
                printable=new Parrot("Whit");
                printable.printInfo();
            default:
                throw new IllegalStateException("Unexpected value: " + className);
        }
        return printable;
    }
}
