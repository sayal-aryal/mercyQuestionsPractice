/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Complete {

    public static void main(String[] args) {
        System.out.println("isComplete: " + isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8})); // return 1
        System.out.println("isComplete: " + isComplete(new int[]{2, 3, 3, 6})); // return 0
        System.out.println("isComplete: " + isComplete(new int[]{2, -3, 4, 3, 6})); // return 0
    }

    public static int isComplete(int[] a) {
        int maximumEvenNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return 0;
            }
            if (a[i] % 2 == 0 && a[i] > maximumEvenNumber) {
                maximumEvenNumber = a[i];
            }
        }

        for (int i = 2; i < maximumEvenNumber; i = i + 2) {
            boolean isPresent = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
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
