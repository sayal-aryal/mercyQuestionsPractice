/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Mercurial {

    public static void main(String[] args) {
        System.out.println("Is Mercurial : " + isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2})); // return 0
        System.out.println("Is Mercurial : " + isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2})); // return 1
        System.out.println("Is Mercurial : " + isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));// return 1
        System.out.println("Is Mercurial : " + isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3})); // return 0
        System.out.println("Is Mercurial : " + isMercurial(new int[]{2, 3, 1, 1, 18}));// return 1
        System.out.println("Is Mercurial : " + isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));// return 1
        System.out.println("Is Mercurial : " + isMercurial(new int[]{3, 3, 3, 3, 3, 3}));// return 1
        System.out.println("Is Mercurial : " + isMercurial(new int[]{1}));// return 1
        System.out.println("Is Mercurial : " + isMercurial(new int[]{}));// return 1

    }

    public static int isMercurial(int[] a) {
        boolean foundPre1 = false;
        boolean foundPost1 = false;
        boolean found3 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                foundPre1 = true;
            }
            if (foundPre1 && a[i] == 3) {
                found3 = true;
            }
            if (foundPre1 && found3 && a[i] == 1) {
                foundPost1 = true;
            }

            if (foundPre1 && found3 && foundPost1) {
                return 0;
            }
        }
        return 1;
    }
}
