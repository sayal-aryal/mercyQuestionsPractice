/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class LargestAdjacentSum {

    public static void main(String args[]) {
        System.out.println("largestAdjacentSum: " + largestAdjacentSum(new int[]{1, 2, 3, 4})); // return 7
        System.out.println("largestAdjacentSum: " + largestAdjacentSum(new int[]{18, -12, 9, -10})); // return 6
        System.out.println("largestAdjacentSum: " + largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1})); // return 2
        System.out.println("largestAdjacentSum: " + largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1})); // return 3
    }

    public static int largestAdjacentSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j <= i+1 ; j++) {
                int tempsum = a[i] + a[j];
                if (tempsum > sum) {
                    sum = tempsum;
                }
            }
        }
        return sum;
    }
}
