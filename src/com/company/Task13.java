package com.company;

import java.util.Scanner;

/*
13. Write a Java program by using two for loops to produce the output
shown below:
Input N natural number, print picture like below in size N*N.
*/
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "*";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}
