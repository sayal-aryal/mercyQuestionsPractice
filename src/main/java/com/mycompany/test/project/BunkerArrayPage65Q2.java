/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class BunkerArrayPage65Q2 {

    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3})); //return 1
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21})); // return 0
    }

    public static int isBunkerArray(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            boolean isOddnumber = false;
            boolean isprime = true;
            if (a[i] % 2 == 1) {
                isOddnumber = true;
            }
            if (isOddnumber) {
                for (int j = 2; j < a[i]; j++) {
                    if (a[i + 1] % j == 0 && j != a[i + 1]) {

                        isprime = false;
                        break;
                    }
                }
                if (isprime) {
                    return 1;
                }

            }

        }
        return 0;
    }
}
