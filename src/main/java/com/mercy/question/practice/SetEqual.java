/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SetEqual {

    public static void main(String args[]) {
        System.out.println("isSetEqual: " + isSetEqual(new int[]{1, 9, 12}, new int[]{12, 1, 9})); // return 1
        System.out.println("isSetEqual: " + isSetEqual(new int[]{1, 7, 1}, new int[]{1, 7, 6})); // return 0
    }

    public static int isSetEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isPresent = true;
                }

            }
            if (!isPresent) {
                return 0;
            }
        }

        for (int i = 0; i < b.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    isPresent = true;
                }

            }
            if (!isPresent) {
                return 0;
            }
        }

        return 1;
    }
}
