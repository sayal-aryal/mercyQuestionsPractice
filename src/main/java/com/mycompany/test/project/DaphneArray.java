/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class DaphneArray {

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6})); //return 1
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6})); // return 0
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6})); // return 0
    }

    public static int isDaphne(int[] a) {
        boolean oddnumberFound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddnumberFound = true;
            }
            if ((i < 3) && (a[i] % 2 == 1)) {
                return 0;
            }

        }

        for (int i = a.length - 1; i >= a.length - 3; i--) {
            if (a[i] % 2 == 1) {
                return 0;
            }
        }
        if (!oddnumberFound) {
            return 0;
        }
        return 1;
    }
}
