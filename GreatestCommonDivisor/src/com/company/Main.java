package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while(first != second) {
            if(first > second) {
                first -= second;
            }
            else {
                second -= first;
            }
        }
        return first;
    }
}
