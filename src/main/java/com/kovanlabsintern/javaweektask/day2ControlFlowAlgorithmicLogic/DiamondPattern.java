package com.kovanlabsintern.javaweektask.day2ControlFlowAlgorithmicLogic;

import java.util.Scanner;

public class DiamondPattern {
    public static void diamond(int num) {
        if (num % 2 == 0) {
            System.out.println("Enter a valid Number (odd only)");
            return;
        }

        int mid = num / 2 + 1;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        diamond(n);
    }
}
