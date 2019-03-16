package com.atul.generic;

/**
 * This class contains methods to invoke generic class methods.
 * */
public class Util {

    /**
     * A method defined using generic types.
     * */
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}