/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class CenteredPg74Q1 {

    public static void main(String[] args) {
        System.out.println("Is Centered :  " + isCentered(new int[]{1, 2, 3, 4, 5})); // return 0
        System.out.println("Is Centered :  " + isCentered(new int[]{3, 2, 1, 4, 5})); // return 1  
        System.out.println("Is Centered :  " + isCentered(new int[]{3, 2, 1, 4, 1})); // return 0 
        System.out.println("Is Centered :  " + isCentered(new int[]{3, 2, 1, 1, 4, 6})); // return 0 
        System.out.println("Is Centered :  " + isCentered(new int[]{1})); // return 1 

    }

    public static int isCentered(int[] a) {

        if (a.length % 2 == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                return 0;
//            }

            int centerElement = a[a.length / 2];

            if (a[i] < centerElement) {
                return 0;
            }

        }
        return 1;
    }

}
