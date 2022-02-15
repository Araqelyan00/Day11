package com.company;

import java.util.Scanner;

/*
Given an integer number x
Find the smallest natural divisor of x other than 1 (2 <= x <= 30_000).
*/
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }

        }
     }
}
