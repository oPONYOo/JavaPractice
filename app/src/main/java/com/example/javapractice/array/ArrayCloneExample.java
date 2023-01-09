package com.example.javapractice.array;

import java.util.Arrays;

public class ArrayCloneExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] copy = array.clone();
        copy[0] = 10;
        array[1] = 10;
        System.out.println("arr:" +Arrays.toString(array));
        System.out.println("copy:" +Arrays.toString(copy));
    }
}
