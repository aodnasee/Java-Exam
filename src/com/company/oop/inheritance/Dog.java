package com.company.oop.inheritance;

public class Dog extends Animal {
    String type;

    public void move(){
        System.out.println("Dog move...");
    }
    public void move(int step){
        System.out.println("Dog move..." + step + "steps");
    }

}
