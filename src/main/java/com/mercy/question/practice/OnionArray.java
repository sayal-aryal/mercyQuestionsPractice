/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;


/**
 *
 * @author user
 */
public class OnionArray {

    public static void main(String[] args) {
        System.out.println("OnionArray : " + isOnionArray(new int[]{1, 2, 19, 4, 5})); // return 1
        System.out.println("OnionArray : " + isOnionArray(new int[]{1, 2, 3, 4, 15})); // return 0
        System.out.println("OnionArray : " + isOnionArray(new int[]{1, 3, 9, 8})); // return 0
        System.out.println("OnionArray : " + isOnionArray(new int[]{2})); // return 1
        System.out.println("OnionArray : " + isOnionArray(new int[]{})); // return 1
        System.out.println("OnionArray : " + isOnionArray(new int[]{-2, 5, 0, 5, 12})); // return 1
    }

    public static int isOnionArray(int[] a) {
        int count = 0;
        int conditionFirstNumber = 0;
        int conditionSecondNumber = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
            for (int j = a.length-1; j >= 0; j--) {
                if (count == 1) {
                    conditionFirstNumber = a[i] + a[j];
                    break;
                }
                if (count == 2) {
                    conditionSecondNumber = a[i] + a[j];
                }

            }

        }
        if (conditionFirstNumber <= 10 && conditionSecondNumber <= 10) {
            return 1;
        }
        return 0;
    }
}
