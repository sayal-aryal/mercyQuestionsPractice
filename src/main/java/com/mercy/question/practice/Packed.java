/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Packed {

    public static void main(String args[]) {
        System.out.println(isPacked(new int[]{2, 2, 1})); // Return 1
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));// Return 0
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));// Return 1
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));// Return 1
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));// Return 0
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));// Return 1
        System.out.println(isPacked(new int[]{}));// Return 1
        System.out.println(isPacked(new int[]{1, 2, 1}));// Return 0
        System.out.println(isPacked(new int[]{2, 1, 1}));// Return 0
        System.out.println(isPacked(new int[]{-3, -3, -3}));// Return 0
        System.out.println(isPacked(new int[]{0, 2, 2}));// Return 0
        System.out.println(isPacked(new int[]{2, 1, 2}));// Return 0
    }

    private static int isPacked(int[] a) {

        int n;
        int count = 0;
        int k = 0;
        int initialindex;
        int finalindex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return 0;
            }
            n = a[i];
            k = 0;
            initialindex = i;
            for (int j = 0; j < a.length; j++) {
                k++;
                if (n == a[j]) {
                    i++;
                    finalindex = k;
                    count++;
                }
            }

            if (n != count || (finalindex - initialindex) != count) {
                return 0;
            }
            i--;
            count = 0;
        }
        return 1;
    }

}
