/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class SumFactor {

    public static void main(String args[]) {
        System.out.println("The Sum Factor is:" + sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
    }

    public static int sumFactor(int[] a) {
        int sum = 0;
        int sumFactor = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (sum == a[i]) {
                sumFactor++;
            }
        }
        return sumFactor;
    }
}
