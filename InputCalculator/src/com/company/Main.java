package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
    }

    public static void inputThenPrintSumAndAverage() {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        int number = 0;
        while(true) {

            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                sum = sum + number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        int avg = (int) Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg + "");
        scanner.close();
    }
}
