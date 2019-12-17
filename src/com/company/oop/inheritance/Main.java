package com.company.oop.inheritance;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.move();
        dog.name = "Phung";
        Animal cat = new Cat();

        cat.name = "PP";

        System.out.println("My dog name is :" + dog.name.toUpperCase());
        cat.move();

       // dog.move(9);
        Animal dog1 = new Dog();
        dog1.move();
       // dog1.type = ""; New property

        String nameDog = returnName(dog);
        String nameCat = returnName(cat);

        System.out.println(nameCat);
        System.out.println(nameDog);



    }
    public static String returnName(Animal animal){
        return animal.name;
    }
}

