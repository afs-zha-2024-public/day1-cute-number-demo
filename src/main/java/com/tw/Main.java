package com.tw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 8, 10, 15};
        int[] evenNumbers = findAllEvenNumbers(numbers);
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static int[] findAllEvenNumbers(int[] numbers){
        return Arrays.stream(numbers)
                .filter( number -> number % 2 == 0)
                .toArray();
    }
}