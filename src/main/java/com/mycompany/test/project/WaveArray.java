/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class WaveArray {

    public static void main(String[] args) {
        System.out.println(isWaveArray(new int[]{7, 2, 9, 10, 5}));
        System.out.println(isWaveArray(new int[]{4, 11, 12, 1, 6}));
        System.out.println(isWaveArray(new int[]{1, 0, 5}));
        System.out.println(isWaveArray(new int[]{2}));
        System.out.println(isWaveArray(new int[]{2, 6, 3, 4}));
    }

    public static int isWaveArray(int[] a) {

        int isConditionSatisfied = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (((a[i] % 2 == 0) && (a[i + 1] % 2 == 0)) || (((a[i] % 2 != 0) && (a[i + 1] % 2 != 0)))) {
                isConditionSatisfied = 0;
            } else {
                isConditionSatisfied = 1;
            }

            if (isConditionSatisfied == 0) {
                return isConditionSatisfied;
            }

        }
        return isConditionSatisfied;
    }

}
