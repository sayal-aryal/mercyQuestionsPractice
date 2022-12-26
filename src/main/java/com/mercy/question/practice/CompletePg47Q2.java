/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class CompletePg47Q2 {

    public static void main(String[] args) {
        System.out.println("isComplete: " + isComplete(new int[]{36, -28})); // return 1 36 is even, 36 is a perfect square, 36-28 = 8
        System.out.println("isComplete: " + isComplete(new int[]{36, 28})); // return 0 There are no two elements that sum to 8
        System.out.println("isComplete: " + isComplete(new int[]{4})); // return 0 It does not have two different elements that sum to 8 (you can't use a[0]+a[0])
        System.out.println("isComplete: " + isComplete(new int[]{3, 2, 1, 1, 5, 6})); // return 0 there is no perfect square.
        System.out.println("isComplete: " + isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81})); // return 0 there is no even number
    }

    public static int isComplete(int[] a) {
        boolean isEvenNumberSatisfied = false;
        boolean isperfectSquare = false;
        boolean isSumEqual8 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                isEvenNumberSatisfied = true;
            }
            for (int j = 2; j < a[i]; j++) {
                if (a[i] / j == j && a[i] % j == 0) {
                    isperfectSquare = true;
                    break;
                }

            }

            for (int k = i + 1; k < a.length; k++) {
                if (a[i] + a[k] == 8) {
                    isSumEqual8 = true;
                }
            }

        }
        if (isEvenNumberSatisfied && isperfectSquare && isSumEqual8) {
            return 1;
        }
        return 0;
    }
}
