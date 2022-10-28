/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */

//Simple but confusing while return 0 or 1 
public class FilterArray {

    public static void main(String[] args) {
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11})); // return 1
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));// return 1
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));// return 1
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));// return 1
        System.out.println(isFilter(new int[]{9, 6, 18}));// return 0
        System.out.println(isFilter(new int[]{4, 7, 13}));// return 0
    }

    public static int isFilter(int[] a) {
        boolean has9 = false;
        boolean has11 = false;
        boolean has7 = false;
        boolean has13 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                has9 = true;
            }
            if (a[i] == 11) {
                has11 = true;
            }
            if (a[i] == 7) {
                has7 = true;
            }
            if (a[i] == 13) {
                has13 = true;
            }

        }

        if ((has9 & !has11)) {
            return 0;
        }
        if (has7 & has13) {
            return 0;
        }
        return 1;
    }

}
