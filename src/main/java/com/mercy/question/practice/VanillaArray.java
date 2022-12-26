/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class VanillaArray {

    public static void main(String args[]) {
        System.out.println("Is Vanilla Array: " + isVanilla(new int[]{11, 101, 1111, 11111}));
    }

    public static int isVanilla(int[] a) {
        int firstNumber = a[0] % 10;

        for (int i = 0; i < a.length; i++) {
            while (a[i] != 0) {
                int remainder = a[i] % 10;
                if (remainder != firstNumber) {
                    return 0;
                }

                a[i] = a[i] / 10;
            }
        }
        return 1;
    }
}
