/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class DualArrayPg74Q2 {

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 3, 0})); //return 1
        System.out.println(isDual(new int[]{1, 2, 2, 1, 3, 0})); // return 1
        System.out.println(isDual(new int[]{1, 1, 2, 2})); // return 0
    }

    public static int isDual(int[] a) {

        if (a.length % 2 != 0) {
            return 0;
        }

        for (int i = 2; i < a.length; i = i + 2) {
            int initialsum = a[0] + a[1];
            int finalSum = a[i] + a[i + 1];

            if (initialsum != finalSum) {
                return 0;
            }
        }
        return 1;
    }

}
