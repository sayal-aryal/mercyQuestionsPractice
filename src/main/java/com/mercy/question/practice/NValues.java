/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class NValues {

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2)); //return 1
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3)); //return 1
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10)); //return 1
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3)); //return 0
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2)); //return 0
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20)); //return 0
    }

    public static int hasNValues(int[] a, int n) {
        int uniqueCount = 0;
        for (int i = 0; i < a.length; i++) {

            boolean isFound = false;
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                uniqueCount++;
            }
        }
        if (uniqueCount == n) {
            return 1;
        }
        return 0;
    }

}
