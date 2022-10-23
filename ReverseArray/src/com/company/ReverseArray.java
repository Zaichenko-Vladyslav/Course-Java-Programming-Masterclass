package com.company;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        int temp;
        String stringArray = Arrays.toString(array);
        System.out.print("Array = " + stringArray);
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length - (i+1); j++) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        String stringArray2 = Arrays.toString(array);
        System.out.println("Reversed array = " + stringArray2);
    }
}