/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class ArrayHasNoZero {

    public static void main(String args[]) {
        System.out.println(arrayHasNoZero(new int[]{1, 2, 3})); // return 1
        System.out.println(arrayHasNoZero(new int[]{1, 0, 4, 0})); // return 0
        System.out.println(arrayHasNoZero(new int[]{1, 2, 3, 0})); // return 0
        System.out.println(arrayHasNoZero(new int[]{0, 0, 0, 0})); // return 0
        System.out.println(arrayHasNoZero(new int[]{})); // return 1
    }

    public static int arrayHasNoZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return 0;
            }
        }
        return 1;
    }
}
