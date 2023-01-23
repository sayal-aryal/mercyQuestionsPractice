/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SequencedArray {

    public static void main(String args[]) {
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5)); //return 1
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));//return 0
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2)); //return 1
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5)); //return 0
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));//return 0
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));//return 0
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));//return 0
    }

    public static int isSequencedArray(int[] a, int lowest, int highest) {

        int size = (highest - lowest) + 1;
        int[] uniqueArray = new int[size];
        int k = 0;
        int tempLowest = lowest;

        for (int i = 0; i < a.length; i++) {
            boolean isEqual = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    isEqual = true;
                }
            }
            if (!isEqual) {
                if (k >= size) {
                    return 0;
                }
                uniqueArray[k] = a[i];
                k++;
            }

        }
        for (int i = 0; i < uniqueArray.length; i++) {
            if (uniqueArray[i] != tempLowest) {
                return 0;
            }
            if (uniqueArray[i] > highest || uniqueArray[i] < lowest) {
                return 0;
            }
            tempLowest++;
        }
        return 1;
    }
}
