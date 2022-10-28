/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class NiceArrayPg86 {

    public static void main(String args[]) {
        System.out.println("Is Nice Array: " + isNiceArray(new int[]{2, 2, 3, 3, 3}));
    }

    public static int isNiceArray(int[] a) {

        boolean isConditionSatisfied = false;
        boolean is2ndConditionSatisfied = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - i; j++) {
                if (a[j] == a[i] + 1 || a[j] == a[i] - 1) {
                    isConditionSatisfied = true;

                }

            }
            if (!isConditionSatisfied) {
                return 0;
            }

        }
        return 1;
    }
}
