/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class EquivalentArray {

    public static void main(String[] args) {
        System.out.println(isEquivalent(new int[]{0, 1, 2}, new int[]{2, 0, 1})); 
        System.out.println(isEquivalent(new int[]{0, 1, 2, 1}, new int[]{2, 0, 1}));
        System.out.println(isEquivalent(new int[]{2, 0, 1}, new int[]{0, 1, 2, 1})); 
        System.out.println(isEquivalent(new int[]{0, 5, 5, 5, 1, 2, 1}, new int[]{5, 2, 0, 1})); 
        System.out.println(isEquivalent(new int[]{5, 2, 0, 1}, new int[]{0, 5, 5, 5, 1, 2, 1})); 
        System.out.println(isEquivalent(new int[]{0, 2, 1, 2}, new int[]{3, 1, 2, 0})); 
        System.out.println(isEquivalent(new int[]{3, 1, 2, 0}, new int[]{0, 2, 1, 0})); 
        System.out.println(isEquivalent(new int[]{1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 2})); 
        System.out.println(isEquivalent(new int[]{}, new int[]{3, 1, 1, 1, 1, 2})); 
        System.out.println(isEquivalent(new int[]{}, new int[]{})); 

    }

    public static int isEquivalent(int[] a, int[] b) {
        if (a.length != 0 && b.length != 0) {
            if (checkForEquivalent(a, b)) {
                if (checkForEquivalent(b, a)) {
                    return 1;
                }
            }

        }
        if (a.length == 0 && b.length == 0) {
            return 1;
        }
        return 0;
    }

    public static boolean checkForEquivalent(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean isContainValue = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isContainValue = true;
                    break;
                }
            }
            if (!isContainValue) {
                return false;
            }

        }
        return true;
    }
}
