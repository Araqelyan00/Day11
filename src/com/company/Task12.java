package com.company;

import java.util.Scanner;

/*
"GNCHE-1" is a complex electronic device that issues every second
the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high
cost of electronic components, you have been instructed to develop an
emulator for these devices.
The number of seconds (from 1 to 1,000,000) is given that the generator
works after being turned on.
*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + ", ");
                count++;
                if (count == n) {
                    break;
                }
            }
            if (count == n) {
                break;
            }
        }
    }
}