/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SumSafePg16Q3 {

    public static void main(String args[]) {
        System.out.println(sumSafe(new int[]{5, -5, 0})); //return 0
        System.out.println(sumSafe(new int[]{5, -2, 1})); //return 1
    }

    public static int sumSafe(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (sum == arr[i]) {
                return 0;
            }
        }
        return 1;
    }
}
