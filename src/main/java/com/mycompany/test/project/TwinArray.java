/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class TwinArray {

    public static void main(String args[]) {
        System.out.println("Is isTwin: " + isTwin(new int[]{3, 5, 8, 10, 27})); // return 1
        System.out.println("Is isTwin: " + isTwin(new int[]{11, 9, 12, 13, 23})); // return 0
        System.out.println("Is isTwin: " + isTwin(new int[]{5, 3, 14, 7, 18, 67})); // return 0
    }

    public static int isTwin(int[] a) {
        for (int i = 0; i < a.length; i++) {

            if (isPrimeNumber(a[i])) {
                boolean twinFound = false;
                for (int j = 0; j < a.length; j++) {
                    if (isPrimeNumber(a[j])) {
                        if (a[i] - a[j] == 2 || a[i] - a[j] == -2) {
                            twinFound = true;
                            break;
                        }
                    }
                }
                if (!twinFound) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && number != i) {
                return false;
            }
        }

        return true;
    }

}
