/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class MartianArray {

    public static void main(String args[]) {
        System.out.println("isMartian: " + isMartian(new int[]{1, 3})); // return 1
        System.out.println("isMartian: " + isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));// return 1
        System.out.println("isMartian: " + isMartian(new int[]{1, 3, 2})); // return 0
        System.out.println("isMartian: " + isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5})); // return 0
        System.out.println("isMartian: " + isMartian(new int[]{1, 2, -18, -18, 1, 2}));// return 0
    }

    public static int isMartian(int[] a) {
        int countNumberOf1 = 0;
        int countNumberOf2 = 0;
        int previousElement=0 ;
        for (int i = 0; i < a.length; i++) {

            if (i != 0) {
                previousElement = a[i - 1];
            }
            if (a[i] == previousElement) {
                return 0;
            }

            if (a[i] == 1) {
                ++countNumberOf1;
            }
            if (a[i] == 2) {
                ++countNumberOf2;
            }
        }
        if (countNumberOf1 > countNumberOf2) {
            return 1;
        }
        return 0;
    }
}
