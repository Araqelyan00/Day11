package com.company;

import java.util.Scanner;

/*
Given an integer number x.
Print all natural divisors of the number x in ascending order (including 1
and the number itself).
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
