package com.company;

import java.util.Scanner;

/*
Integers a and b are entered. It is guaranteed that a does not
exceed b.
Print all numbers on the segment from a to b that are exact
squares. If there are no such numbers, then you do not need to
display anything.
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a * a <= b){
            for (int i = a; i <= b; i++){
                if (i * i <= b){
                    System.out.println(i * i);
                }
            }
        }
    }
}
