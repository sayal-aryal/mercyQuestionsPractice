/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class OneBalanced {

    public static void main(String[] args) {
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1})); // return 1
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0})); // return 0
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1})); // return 0
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{})); // return 1
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{3, 4, 1, 1})); // return 1
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{1, 1, 3, 4})); // return 1
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{3, 3, 3, 3, 3, 3})); // return 0
        System.out.println("OneBalanced : " + isOneBalanced(new int[]{1, 1, 1, 1, 1, 1})); // return 0
    }

    public static int isOneBalanced(int[] a) {
        boolean foundPre1 = false;
        boolean foundPost1 = false;
        boolean foundOtherNumber = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                foundPre1 = true;
            }
            if (foundPre1 && a[i] != 1) {
                foundOtherNumber = true;
            }
            if (foundPre1 && foundOtherNumber && a[i] == 1) {
                foundPost1 = true;
            }
        }
    }
}
