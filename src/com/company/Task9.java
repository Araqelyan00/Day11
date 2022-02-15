package com.company;

import java.util.Scanner;

/*
Calculate the sum of the given 10 natural numbers.
Input integers from console.
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum = sum + scanner.nextInt();
        }
        System.out.println(sum);
    }
}
