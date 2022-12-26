/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author user
 */
public class MinMaxDisjoint {

    public static void main(String args[]) {
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }

    public static int isMinMaxDisjoint(int[] a) {

        if (a.length == 0) {
            return 0;
        }
        int maxValue = Arrays.stream(a).max().getAsInt();
         
        int minValue = Arrays.stream(a).min().getAsInt();
        int maxValueCount = (int) Arrays.stream(a).filter(number -> maxValue == number).count();
        int minValueCount = (int) Arrays.stream(a).filter(number -> minValue == number).count();

        if (maxValueCount > 1 || minValueCount > 1) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (maxValue == minValue) {
                return 0;
            }

            if (a[i] == maxValue && a[i + 1] == minValue || a[i] == minValue && a[i + 1] == maxValue) {
                return 0;
            }

        }
        return 1;
    }

}
