package com.company;

import java.util.Scanner;

/*
Print all numbers on the segment from a to b that give the
remainder of c when divided by d. If such numbers do not exist,
then you do not need to display anything.
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
             for (int i = a; i <= b ; i++){
                 if(i % d == c){
                     System.out.println(i);
                 }
             }
    }
}
