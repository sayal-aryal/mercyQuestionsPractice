/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class LargestPrimeFactor {

    public static void main(String args[]) {
        System.out.println("largestPrimeFactor: " + largestPrimeFactor(10)); // return 5
        System.out.println("largestPrimeFactor: " + largestPrimeFactor(6936)); // return 0
        System.out.println("largestPrimeFactor: " + largestPrimeFactor(1)); // return 0
    }

    public static int largestPrimeFactor(int a) {

        if (a <= 1) {
            return 0;
        }
        int largestPrimeFactor = 0;
        for (int i = 2; i <= a / 2; i++) {
            boolean isDivisiable = false;
            if (a % i == 0) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isDivisiable = true;
                    }
                }
                if (!isDivisiable) {
                    if (largestPrimeFactor < i) {
                        largestPrimeFactor = i;
                    }
                }

            }
        }
        return largestPrimeFactor;
    }
}
