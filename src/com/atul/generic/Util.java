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

    /**
     * This method demonstrate on how to use Comparable interface to compare two objects, as >, < etc can only be applied to primitive types.
     * */
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

}