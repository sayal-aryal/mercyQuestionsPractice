/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class BalancedArrayPg60Q3 {

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3})); //return 1;
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2})); //return 1;
        System.out.println(isBalanced(new int[]{5, 2, -2})); //return 0;
    }

    public static int isBalanced(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean isFound = false;
            if (a[i] > 0) {

                for (int j = 0; j < a.length; j++) {

                    if (-a[i] == a[j]) {
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    return 0;
                }
            }

        }
        return 1;
    }
}
