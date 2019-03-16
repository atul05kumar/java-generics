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

        //Calling a generic method
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");

        //Type is explicitly provided, this can be ignored and the compiler will infer the required type.
        boolean same = Util.<Integer, String>compare(p1, p2);

        System.out.println("Both Pairs are same --> "  + same);
    }
}
