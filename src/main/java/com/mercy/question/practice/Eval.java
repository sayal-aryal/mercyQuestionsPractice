/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import static com.mercy.question.practice.EquivalentArray.isEquivalent;

/**
 *
 * @author user
 */
public class Eval {

    public static void main(String[] args) {
        System.out.println(eval(new int[]{0, 1, 2, 3, 4}, 1.0)); // return 10.0
        System.out.println(eval(new int[]{3, 2, 1}, 3.0)); // return 18.0
        System.out.println(eval(new int[]{3, -2, -1}, 2.0)); // return -5.0
        System.out.println(eval(new int[]{3, 2, 1}, -3.0)); // return 6.0
        System.out.println(eval(new int[]{3, 2}, 2.0)); // return 7.0
        System.out.println(eval(new int[]{4, 0, 9}, 2.0)); // return 40.0
        System.out.println(eval(new int[]{10}, 2.0)); // return 10.0
        System.out.println(eval(new int[]{0, 1}, 10.0)); // return 10.0
    }

    public static double eval(int[] a, double b) {
        double multiply = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            multiply += a[i] * (Math.pow(b, i));

        }
        return multiply;
    }

}
