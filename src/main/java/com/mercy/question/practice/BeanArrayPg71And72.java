/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class BeanArrayPg71And72 {

    public static void main(String[] args) {
        System.out.println("BeanArrayPg71And72 " + isBeanArray(new int[]{4, 9, 8})); // return 1
        System.out.println("BeanArrayPg71And72 " + isBeanArray(new int[]{2, 2, 5, 11, 23}));// return 1
        System.out.println("BeanArrayPg71And72 " + isBeanArray(new int[]{7, 7, 3, 6}));// return 1
        System.out.println("BeanArrayPg71And72 " + isBeanArray(new int[]{0}));// return 1
        System.out.println("BeanArrayPg71And72 " + isBeanArray(new int[]{3, 8, 4}));// return 0
    }

    public static int isBeanArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isvalid = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2 * a[j] || a[i] == 2 * a[j] + 1 || a[i] == a[j] / 2) {
                    isvalid = true;
                    break;
                }
            }
            if (!isvalid) {
                return 0;
            }
        }
        return 1;
    }
}
