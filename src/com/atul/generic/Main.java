package com.atul.generic;

public class Main {

    public static void main(String[] args) {

        //Instantiating a generic class
        Box<String> box1 = new Box<String>();

        box1.setType("Square");
        System.out.println(box1.getType());

        //Instantiating with diamond notation
        Box<Integer> box2 = new Box<>();
        box2.setType(2);
        System.out.println(box2.getType());
    }
}
