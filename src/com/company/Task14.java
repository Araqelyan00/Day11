package com.company;

import java.util.Scanner;

/*
14.Write a program that prompts the user for the size (a non-negative
integer in int); and prints the following checkerboard pattern.
*/
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }

            System.out.print("\n");
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(" ");
        }
    }
}
