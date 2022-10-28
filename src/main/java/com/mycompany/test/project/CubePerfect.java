/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class CubePerfect {

    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1})); //return 1
        System.out.println(isCubePerfect(new int[]{64})); // return 1
        System.out.println(isCubePerfect(new int[]{63})); // return 0
        System.out.println(isCubePerfect(new int[]{-1, 0, 1})); // return 1
        System.out.println(isCubePerfect(new int[]{})); // return 1
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36})); // return 0
    }

    public static int isCubePerfect(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int multiply = 1;
            if (perfectCube(a[i])) {

            } else {
                return 0;
            }

        }
        return 1;

    }

    public static boolean perfectCube(int a) {
        if (a < 0) {
            a = -a;
        }
        if (a == 0) {
            return true;
        }
        for (int i = 1; i <= a; i++) {

            int cube = i * i * i;

            if (cube > a) {
                return false;
            }
            if (cube == a) {
                return true;
            }

        }

        return false;

    }

}
