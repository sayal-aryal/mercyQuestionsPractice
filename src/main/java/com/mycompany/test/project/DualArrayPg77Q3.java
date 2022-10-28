/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class DualArrayPg77Q3 {

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 1, 3, 3, 2})); //return 1
        System.out.println(isDual(new int[]{2, 5, 2, 5, 5})); // return 0
        System.out.println(isDual(new int[]{3, 1, 1, 2, 2})); // return 0
    }

    public static int isDual(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    ++count;
                }
            }
            if (count != 2) {
                return 0;
            }
        }
        return 1;
    }
}
