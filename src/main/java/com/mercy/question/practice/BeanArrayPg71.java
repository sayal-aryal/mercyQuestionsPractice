/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import static com.mercy.question.practice.Centered15.f;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class BeanArrayPg71 {

    public static void main(String[] args) {
        System.out.println("{2, 10, 9, 3} Bean Array True: " + isBeanArray(new int[]{2, 10, 9, 3}));
        System.out.println("{2, 2, 3, 3, 3} Bean Array True: " + isBeanArray(new int[]{2, 2, 3, 3, 3}));
        System.out.println("{1, 1, 1, 2, 1, 1} Bean Array True: " + isBeanArray(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println("{0,-1,1} Bean Array True: " + isBeanArray(new int[]{0, -1, 1}));
        System.out.println("{0,-1,1} Bean Array False: " + isBeanArray(new int[]{3, 4, 5, 7}));
    }

    public static int isBeanArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean isConditionSatisfied = false;

            for (int j = 0; j < a.length; j++) {

                if ((a[j] == a[i] + 1) || (a[j] == a[i] - 1)) {
                    isConditionSatisfied = true;
                    break;
                }
            }
            if (!isConditionSatisfied) {
                return 0;
            }

        }
        return 1;
    }

}
