package com.example.mosyalgorithms;

import java.util.Arrays;

public class SquaringSortedArray {
    public static void main(String[] args) {
        int[] nums = {-1, 3,- 4, 5, 6};
        SquaringSortedArray squaringSortedArray = new SquaringSortedArray();
        System.out.println(Arrays.toString(squaringSortedArray.squaringSorted(nums)));
    }

    public int[] squaringSorted(int[] numbers) {
        return Arrays.stream(numbers).sorted().map(el -> el * el).sorted().toArray();
    }
}
