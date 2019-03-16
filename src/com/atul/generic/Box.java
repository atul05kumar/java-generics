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

}
