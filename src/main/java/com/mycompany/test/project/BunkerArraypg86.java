/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class BunkerArraypg86 {

    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{7, 6, 10, 1}));
        System.out.println(isBunkerArray(new int[]{7, 6, 10}));
    }

    public static int isBunkerArray(int[] a) {
        boolean containPrimeNumber = false;
        boolean containOne = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                containPrimeNumber = true;
            }
            if (a[i] == 1) {
                containOne = true;
            }
            if (containPrimeNumber && containOne) {
                return 1;
            }
        }
        return 0;
    }
}
