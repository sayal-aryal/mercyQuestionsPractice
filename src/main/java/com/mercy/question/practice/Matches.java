/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Matches {

    public static void main(String args[]) {
        System.out.println("Matches: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
    }

    public static int matches(int[] a, int[] p) {
        int firstElement = p[0];
        int secondElement = p[1];
        int thirdElement = p[2];
        int positiveFirstElement = Math.abs(p[0]);
        int positiveSecondElement = Math.abs(p[1]);
        int positiveThirdElement = Math.abs(p[2]);
        boolean isConditionSatisfied = false;

        if (a.length == positiveFirstElement + positiveSecondElement + positiveThirdElement) {
            for (int i = 0; i < positiveFirstElement; i++) {
                if ((a[i] < 0 && firstElement < 0) || (a[i] > 0 && firstElement > 0)) {
                    isConditionSatisfied = true;
                } else {
                    return 0;
                }
            }
            for (int j = positiveFirstElement; j < (positiveFirstElement + positiveSecondElement); j++) {
                if ((a[j] < 0 && secondElement < 0) || (a[j] > 0 && secondElement > 0)) {
                    isConditionSatisfied = true;
                } else {
                    return 0;
                }
            }

            for (int j = (positiveFirstElement + positiveSecondElement); j < (positiveFirstElement + positiveSecondElement + positiveThirdElement); j++) {
                if ((a[j] < 0 && thirdElement < 0) || (a[j] > 0 && thirdElement > 0)) {
                    isConditionSatisfied = true;
                } else {
                    return 0;
                }
            }

        }
        if (isConditionSatisfied) {
            return 1;
        }
        return 0;
    }
}
