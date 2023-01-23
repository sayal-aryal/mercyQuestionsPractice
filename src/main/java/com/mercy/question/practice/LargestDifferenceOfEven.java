/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class LargestDifferenceOfEven {

    public static void main(String args[]) {
        System.out.println("largestAdjacentSum: " + largestDifferenceOfEven(new int[]{-2, 3, 4, 9})); // return 6
        System.out.println("largestAdjacentSum: " + largestDifferenceOfEven(new int[]{1, 3, 5, 9})); // return -1
        System.out.println("largestAdjacentSum: " + largestDifferenceOfEven(new int[]{1, 18, 5, 7, 33})); // return -1
        System.out.println("largestAdjacentSum: " + largestDifferenceOfEven(new int[]{2, 2, 2, 2})); // return 0
        System.out.println("largestAdjacentSum: " + largestDifferenceOfEven(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4})); // return 4
    }

    public static int largestDifferenceOfEven(int[] a) {
        int evenCount = 0;
        int largestEven = 0;
        int lowestEven = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount += 1;
                if (Math.abs(a[i]) > largestEven) {
                    largestEven = a[i];
                }
                if (Math.abs(a[i]) < lowestEven) {
                    lowestEven = a[i];

                }
            }

        }
        if (a.length == evenCount) {
            return 0;
        }
        if (evenCount < 2) {
            return -1;
        }

        return (largestEven - lowestEven);
    }
}
