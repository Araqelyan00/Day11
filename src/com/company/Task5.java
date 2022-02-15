package com.company;

import java.util.Scanner;

/*
Given an integer number x
Print the number consisting of the digits of the given number x in reverse
order. You do not need to output leading zeros.
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int printNumber = 0;
        for (int i = x; i != 0; i = i / 10){
            printNumber = printNumber * 10 +  i % 10;
        }
        System.out.println(printNumber);
    }
}
