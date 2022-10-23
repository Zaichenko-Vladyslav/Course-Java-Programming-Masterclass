package com.company;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int i=0; i<number; i++) {
            int scan = scanner.nextInt();
            array[i] = scan;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}