/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Trivalent {

    public static void main(String[] args) {
        System.out.println("{22, 19, 10, 10, 19, 22, 22, 10}  trivalent status is: " + f(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println("{1, 2, 2, 2, 2, 2, 2} trivalent status is: " + f(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println("{-1, 0, 1, 0, 0, 0} trivalent status is: " + f(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println("{2147483647, -1, -1, -2147483648} trivalent status is: " + f(new int[]{2147483647, -1, -1, -2147483648}));
        System.out.println("{} trivalent status is: " + f(new int[]{}));
        System.out.println("{2, 2, 3, 3, 3, 3, 2, 41, 65} trivalent status is: " + f(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        // System.out.println(" trivalent status is: " + f(new int[]));
    }

    public static int f(int[] a) {
        if (Arrays.stream(a).distinct().count() == 3) {
            return 1;
        }
        return 0;
    }
}
