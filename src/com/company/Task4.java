package com.company;

import java.util.Scanner;

/*
Enters 2 integer numbers : x and d from console
Count and print one number - how many times the digit d occurs in
the representation of a natural number x.
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        for (int i = x; i != 0;i = i / 10){
            if (i % 10 == d){
                count++;
            }
        }
        System.out.println(count);
    }
}
