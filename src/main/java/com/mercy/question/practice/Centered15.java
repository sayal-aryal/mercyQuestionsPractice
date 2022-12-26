/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Centered15 {

    public static void main(String[] args) {
        System.out.println("{3, 2, 10, 4, 1, 6, 9} centered15 status: " + f(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println("{2, 10, 4, 1, 6, 9} centered15 status: " + f(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println("{3, 2, 10, 4, 1, 6}  centered15 status: " + f(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println("{1,1,8, 3, 1, 1} centered15 status: " + f(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println("{9, 15, 6}  centered15 status: " + f(new int[]{9, 15, 6}));
        System.out.println("{1, 1, 2, 2, 1, 1}  centered15 status: " + f(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println("{1, 1, 15, -1,-1}  centered15 status: " + f(new int[]{1, 1, 15, -1, -1}));
        System.out.println("{1, 1, 14, 1, 1,-1}  centered15 status: " + f(new int[]{1, 1, 14, 1, 1, -1}));
    }

    public static int f(int[] a) {

        if (a.length < 3) {
            return 0;
        }

        for (int i = 1; i < a.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < a.length - i; j++) {
                sum += a[j];
                if (sum > 15) {
                    break;
                }

            }
            if (sum == 15) {
                return 1;
            }
        }
        return 0;
    }
}
