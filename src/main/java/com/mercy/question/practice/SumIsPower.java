/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SumIsPower {

    public static void main(String args[]) {
        System.out.println(sumIsPower(new int[]{8,8,8}));
    }

    public static boolean sumIsPower(int[] arr) {
        int sumOfAnArray = 0;
        int powerOfTwo = 1;

        for (int i = 0; i < arr.length; i++) {
            sumOfAnArray += arr[i];
        }
        for (int i = 0;; i++) {
            powerOfTwo *=  2;

            if (sumOfAnArray == powerOfTwo) {
                return true;
            }
            if (powerOfTwo > sumOfAnArray) {
                break;
            }
        }
        return false;
    }
}
