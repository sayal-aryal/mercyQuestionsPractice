/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import static com.mercy.question.practice.CharArrayExample.f;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class StantonMeasure {

    public static void main(String args[]) {
        int intArray[] = {};

        System.out.println("The Stanton Measure Array is: " + stantonMeasure(intArray));

    }

    public static int stantonMeasure(int[] a) {
        int occuranceOfOne = 0;
        int n = 0;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                occuranceOfOne++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == occuranceOfOne) {
                n++;
            }
        }

        return n;
    }

}
