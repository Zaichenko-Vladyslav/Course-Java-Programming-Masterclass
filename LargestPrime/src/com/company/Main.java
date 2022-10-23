package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;
                }
            }
            return number;
        }
    }
}
