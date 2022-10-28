/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class AllValuesTheSame {

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 1, 1, 1})); //return 1;
        System.out.println(isAllPossibilities(new int[]{83, 83, 83})); //return 1;
        System.out.println(isAllPossibilities(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})); //return 1;
        System.out.println(isAllPossibilities(new int[]{1, -2343456, 1, -2343456})); //return 0;
        System.out.println(isAllPossibilities(new int[]{0, 0, 0, 0, -1})); //return 0;
        System.out.println(isAllPossibilities(new int[]{432123456})); //return 1;
        System.out.println(isAllPossibilities(new int[]{-432123456})); //return 1;
        System.out.println(isAllPossibilities(new int[]{})); //return 0;
    }

    public static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] != a[j]) {
                    return 0;
                }
            }

        }
        return 1;
    }
}
