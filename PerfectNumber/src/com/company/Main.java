package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
