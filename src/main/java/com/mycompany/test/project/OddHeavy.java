/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

import static com.mycompany.test.project.NormalNumber.isNormal;

/**
 *
 * @author user
 */
public class OddHeavy {

    public static void main(String[] args) {
        System.out.println("Is Odd Heavy : " + isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println("Is Odd Heavy : " + isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println("Is Odd Heavy : " + isOddHeavy(new int[]{1, 1, 1, 1}));
        System.out.println("Is Odd Heavy : " + isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println("Is Odd Heavy : " + isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
        System.out.println("Is Odd Heavy : " + isOddHeavy(new int[]{2, 4, 6, 8}));
    }

    public static int isOddHeavy(int[] a) {
        boolean containsOddElements = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                containsOddElements = true;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] >= a[i]) {
                        return 0;
                    }
                }
            }

        }
        if (!containsOddElements) {
            return 0;
        }
        return 1;
    }
}
