/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class IsBalanced {

    public static void main(String args[]) {
        System.out.println("Is Balanced " + isBalanced(new int[]{2, 3, 6, 7}));  //balanced
        System.out.println("Is Balanced " + isBalanced(new int[]{6, 7, 2, 3, 12}));//balanced
        System.out.println("Is Balanced " + isBalanced(new int[]{7, 15, 2, 3}));//not balanced
        System.out.println("Is Balanced " + isBalanced(new int[]{16, 6, 2, 3}));//not balanced
    }

    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i % 2 == 0 && a[i] % 2 == 1) || (i % 2 == 1 && a[i] % 2 == 0)) {
                return 0;
            }
        }
        return 1;
    }
}
