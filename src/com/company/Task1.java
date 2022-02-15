package com.company;

import java.util.Scanner;

/*
Write a java program to print all even numbers from a given
range, from a to b. Input a and b from console.
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
