/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SequentiallyBounded {

    public static void main(String args[]) {
        System.out.println(isSequentiallyBounded(new int[]{0, 1})); // return 0 
        System.out.println(isSequentiallyBounded(new int[]{1, 2})); // return 0 
        System.out.println(isSequentiallyBounded(new int[]{}));// return 1 
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));// return 1 
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5})); // return 0 
    }

    public static int isSequentiallyBounded(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length - i; j++) {
                if ((count < a[i] && a[j] != a[i])) {
                    return 0;
                }
                if (a[i] == a[j]) {
                    count++;
                    if (count >= a[i]) {
                        return 0;
                    }

                }

            }
        }
        return 1;
    }
}
