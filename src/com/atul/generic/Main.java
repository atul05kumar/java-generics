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

        Box<Integer> integerBox = new Box<>();
        integerBox.setType(new Integer(10));

        /**
         * Below statement will throw a compile time error, as the Types allowed in inspect method should be super classed by Number.
         * */
        //integerBox.inspect("some text");


        /**
         * Comparing two objects using Comparable interface.
         * */
        Integer [] array = new Integer[]{3,6,1,8};
        Integer count = Util.countGreaterThan(array,4);
        System.out.println("Numbers greater than the element are : " + count);


        /**
         * A concrete type is allowed as a type arguments in a generic type if it is the subtype.
         * In below example, since Integer and Double both are subtypes of Number, both are allowed.
         * */
        Box<Number> numberBox = new Box<>();
        numberBox.setType(new Integer(10)); // OK
        numberBox.setType(new Double(2.3)); // OK


        /**
         * Recursive Generics to implement Fluent Builder Pattern.
         * */
        EmployeeBuilder pb = new EmployeeBuilder();
        Person person = pb
                .withName("Atul")
                .worksAt("Walmart")
                .build();
        System.out.println(person);


    }
}
