package com.company;

import java.util.Scanner;

/*
Convert a natural number from binary to decimal (no more than 10
    digits in a binary number)
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        int decimal = 0;
        int x = 1;
        for (int i = binary; i != 0; i = i / 10){
            decimal = decimal + (x * (i % 10));
            x = x * 2;
        }
        System.out.println(decimal);
    }
}
