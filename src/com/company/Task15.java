package com.company;

import java.util.Scanner;

/*
Write a program that prompts user for the size (a positive integer in
int); and prints the multiplication table
*/
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}
