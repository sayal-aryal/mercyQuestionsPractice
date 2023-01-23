/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Cluster {

    public static void main(String args[]) {
        for (int a : clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})) {
            System.out.print(a + ",");
        }
        System.out.println();

        for (int a : clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})) {
            System.out.print(a + ",");
        }
        System.out.println();
        for (int a : clusterCompression(new int[]{18})) {
            System.out.print(a + ",");
        }
        System.out.println();
        for (int a : clusterCompression(new int[]{-5, -5, -5, -5, -5})) {
            System.out.print(a + ",");
        }
        System.out.println();
        for (int a : clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})) {
            System.out.print(a + ",");
        }
        System.out.println();
        for (int a : clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})) {
            System.out.print(a + ",");
        }
    }

    public static int[] clusterCompression(int[] a) {
        int count = 0;
        int newArray[];
        int count2 = 0;
        if (a.length == 0 || a.length == 1) {
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                if (a[i] != a[i + 1]) {
                    count++;
                }
            } else {
                if (a[i - 1] != a[i] || i == a.length - 1) {
                    count++;
                }
                if (count == 0) {
                    count++;
                }
            }
        }
        newArray = new int[count];
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                if (a[i] != a[i + 1]) {
                    newArray[count2] = a[i];
                    count2++;
                }
            } else {
                if (a[i - 1] != a[i] || i == a.length - 1) {
                    newArray[count2] = a[i];
                    break;
                }
                if (count2 == 0) {
                    newArray[count2] = a[i];
                }
            }
        }
        return newArray;
    }

}
