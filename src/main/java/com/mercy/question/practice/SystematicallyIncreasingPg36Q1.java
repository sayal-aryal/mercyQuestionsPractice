/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SystematicallyIncreasingPg36Q1 {

    public static void main(String args[]) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));     //return 1
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 4, 5})); //return 1
        System.out.println(isSystematicallyIncreasing(new int[]{3, 4, 5, 6, 7})); //return 1
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3})); //return 0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2})); //return 0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));//return 0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));//return 0
    }

    public static int isSystematicallyIncreasing(int[] a) {
        int number = a[0];
        int FirstNumber = a[0];
        if (a.length == 1) {
            return 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            number = number + 1;
            if (a[i + 1] != number) {
                return 0;
            }
        }
        return 1;

    }

}
