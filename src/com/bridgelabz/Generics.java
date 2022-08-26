package com.bridgelabz;

public class Generics<T extends Comparable<T>> {

    public T x, y, z;

    public Generics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> void checkMax(T x, T y, T z){
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;

    }


    public static void main(String[] args) {
        System.out.println("Welcome to Generics program ");


    }
}
