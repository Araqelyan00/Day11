package com.company;

import java.util.Scanner;

/*
Enter the number N, followed by N integers.
- Count how many zeros, positive numbers, negative numbers
among the given N numbers.
- It is necessary to print first the number of zeros, then the number
of positive and negative numbers.
*/
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int zerosCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int input;
        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            if (input > 0) {
                positiveCount++;
            } else if (input < 0) {
                negativeCount++;
            } else zerosCount++;
        }
        if (zerosCount != 0)
            System.out.println("Zeros count: " + zerosCount);
        if (negativeCount != 0)
            System.out.println("Negative count: " + negativeCount);
        if (positiveCount != 0)
            System.out.println("Positive count: " + positiveCount);
    }
}
