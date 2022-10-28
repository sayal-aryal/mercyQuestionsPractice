/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class TwinPrime {

    public static void main(String args[]) {
        System.out.println("Is isTwin: " + isTwin(5)); // return 1
        System.out.println("Is isTwin: " + isTwin(7)); // return 1
        System.out.println("Is isTwin: " + isTwin(21)); // return 0
        System.out.println("Is isTwin: " + isTwin(8)); // return 0
    }

    public static int isTwin(int a) {
        if (isPrimeNumber(a)) {
            if (isPrimeNumber(a + 2) || isPrimeNumber(a - 2)) {

                return 1;
            }
        }

        return 0;
    }

    public static boolean isPrimeNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
