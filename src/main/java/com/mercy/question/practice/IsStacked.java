/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class IsStacked {

    public static void main(String args[]) {
        System.out.println("Is Stacked: " + isStacked(15));
    }

    public static int isStacked(int n) {
        int stackedNumber = 0;
        for (int i = 1; i <= n / 2; i++) {
            stackedNumber = stackedNumber + i;
            if (stackedNumber == n) {
                return 1;
            }
        }
        return 0;
    }
}
