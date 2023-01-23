/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class PrimeHappy {

    public static void main(String args[]) {

        System.out.println("Prime Happy " + isPrimeHappy(5)); // return 1
        System.out.println("Prime Happy " + isPrimeHappy(25)); // return 1
        System.out.println("Prime Happy " + isPrimeHappy(32)); // return 1
        System.out.println("Prime Happy " + isPrimeHappy(8)); // return 0
        System.out.println("Prime Happy " + isPrimeHappy(2)); // return 0

    }

    public static int isPrimeHappy(int n) {
        int number = 2;
        if (n == 2) {
            return 0;
        }

        for (int i = 3; i < n; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                }

            }
            if (isPrimeNumber) {
                number = number + i;
            }

        }
        if (number % n == 0) {
            return 1;
        }

        return 0;
    }
}
