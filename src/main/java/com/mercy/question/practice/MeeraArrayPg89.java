/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class MeeraArrayPg89 {

    public static void main(String[] args) {
        System.out.println("Is Meera Array Yes" + isMeera(new int[]{7, 6, 0, 10, 1}));
        System.out.println("Is Meera Array Not" + isMeera(new int[]{7, 6, 10}));
        System.out.println("Is Meera Array Not" + isMeera(new int[]{6, 10, 0}));
        System.out.println("Is Meera Array Yes" + isMeera(new int[]{3, 7, 0, 8, 0, 5}));

    }

    public static int isMeera(int[] a) {

        boolean isContainPrimeNumber = false;
        boolean isContainZero = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                isContainPrimeNumber = true;
            }
            if (a[i] == 0) {
                isContainZero = true;
            }
        }

        if ((isContainPrimeNumber && isContainZero) || (!isContainPrimeNumber && !isContainZero)) {
            return 1;
        }
        return 0;
    }
}
