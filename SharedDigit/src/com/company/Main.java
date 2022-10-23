package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean hasSharedDigit(int fNumber, int sNumber) {

        if (fNumber >= 10 && fNumber <= 99 && sNumber >= 10 && sNumber <= 99) {
            if ((fNumber / 10 == sNumber / 10) ||
                    (fNumber %  10 == sNumber % 10) ||
                    (fNumber %  10 == sNumber / 10) ||
                    (fNumber /  10 == sNumber % 10)) {
                return true;
            }
        }

        return false;
    }
}