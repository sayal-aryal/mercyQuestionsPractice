/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class ArrayOfAllPossibility {

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3})); //return 1;
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0})); //return 1;
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3})); //return 0;
        System.out.println(isAllPossibilities(new int[]{0, 2, 3})); //return 0;
        System.out.println(isAllPossibilities(new int[]{})); //return 0;
    }

    public static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                return 0;
            }
        }
        return 1;
    }
}
