package com.atul.generic;

/**
 * A generic Box class
 * */
public class Box<T> {

    private T type;

    public void setType(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    /**
     * This method will only accept types which are subtypes of Number.
     * For others, it will throw compilation error.
     * This demonstrates the functionality of Bounded Type Parms in Generic types.
     * */
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + type.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }


}
