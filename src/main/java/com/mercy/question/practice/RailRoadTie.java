/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class RailRoadTie {

    public static void main(String args[]) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2})); // return 1
        System.out.println(isRailroadTie(new int[]{1, 2}));// return 1
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));// return 1
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));// return 1
        System.out.println(isRailroadTie(new int[]{0,0,0,0}));// return 0
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));// return 0
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));// return 0
    }

    public static int isRailroadTie(int[] a) {
        boolean containsNonZeroElement = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                containsNonZeroElement = true;
            }
            if (a[0] == 0 || a[a.length - 1] == 0) {
                return 0;
            }
            if (i != 0 && i < a.length - 1) {
                if (a[i] != 0 && (a[i + 1] == 0 && a[i - 1] == 0)) {
                    return 0;
                }
                if (a[i] != 0 && (a[i + 1] != 0 && a[i - 1] != 0)) {
                    return 0;
                }

            }
        }
        if (!containsNonZeroElement) {
            return 0;
        }
        return 1;
    }
}
